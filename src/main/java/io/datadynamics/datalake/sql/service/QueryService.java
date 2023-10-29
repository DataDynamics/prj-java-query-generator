package io.datadynamics.datalake.sql.service;

import com.google.common.base.Joiner;
import io.datadynamics.datalake.sql.model.Condition;
import io.datadynamics.datalake.sql.model.QueryRequest;
import io.datadynamics.datalake.sql.service.where.WhereMap;

import java.util.ArrayList;
import java.util.List;

public class QueryService {

    public static boolean isNullOrEmpty(String s) {
        return s == null || s.isEmpty();
    }

    public String generateQuery(QueryRequest request) {
        List<String> queryFragments = new ArrayList();
        queryFragments.add(select(request));
        queryFragments.add(from(request));
        queryFragments.add(where(request));
        if (request.getLimit() != null || request.getLimit() > 0) queryFragments.add(limit(request));
        if (!isNullOrEmpty(request.getQueryPostfix())) queryFragments.add(request.getQueryPostfix());

        return Joiner.on("\n").join(queryFragments);
    }

    private String where(QueryRequest request) {
        List<String> conditionColumnNames = new ArrayList<>();
        for (Condition condition : request.getConditions()) {
            conditionColumnNames.add(condition.getColumnName());
        }

        boolean partitionExists = (request.getPartitions() != null && request.getPartitions().size() > 0) ? false : true;
        List<String> partitions = request.getPartitions();
        for (String partition : partitions) {
            if (conditionColumnNames.contains(partition)) {
                partitionExists = true;
                break;
            }
        }

        if (!partitionExists) {
            throw new IllegalArgumentException("파티션 컬럼에 대한 조건이 누락되어 있습니다.");
        }

        List<String> wheres = new ArrayList<>();
        List<Condition> conditions = request.getConditions();
        for (Condition condition : conditions) {
            wheres.add(WhereMap.getWhere(condition).query(condition));
        }
        return String.format("WHERE %s", Joiner.on(" AND ").join(wheres));
    }

    private String from(QueryRequest request) {
        return String.format("FROM %s", request.getTableName());
    }

    private String select(QueryRequest request) {
        List<String> selected = request.getSelected();
        return String.format("SELECT %s", Joiner.on(", ").join(selected));
    }

    private String limit(QueryRequest request) {
        return String.format("LIMIT %s", request.getLimit());
    }

}
