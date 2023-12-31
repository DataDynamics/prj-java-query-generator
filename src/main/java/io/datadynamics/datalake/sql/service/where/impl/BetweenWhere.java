package io.datadynamics.datalake.sql.service.where.impl;

import io.datadynamics.datalake.sql.model.Condition;
import io.datadynamics.datalake.sql.model.DataType;
import io.datadynamics.datalake.sql.service.where.Where;
import org.springframework.util.Assert;

import java.util.List;

public class BetweenWhere implements Where {

    @Override
    public String query(Condition condition) {
        Assert.notEmpty(condition.getValues(), "조건에 대한 값이 있어야 합니다.");
        Assert.isTrue(condition.getValues().size() == 2, "조건값은 2개 이어야 합니다.");

        String columnName = condition.getColumnName();
        List<String> values = condition.getValues();
        if (condition.getDataType() == DataType.TIMESTAMP
                || condition.getDataType() == DataType.DATE) {
            return String.format("%s >= '%s' AND %s <= '%s'", columnName, values.get(0).trim(), columnName, values.get(1).trim());
        } else {
            return String.format("%s BETWEEN '%s' AND '%s'", columnName, values.get(0).trim(), values.get(1).trim());
        }
    }

}
