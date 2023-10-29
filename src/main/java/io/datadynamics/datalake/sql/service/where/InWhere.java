package io.datadynamics.datalake.sql.service.where;

import io.datadynamics.datalake.sql.model.Condition;
import io.datadynamics.datalake.sql.util.ArrayJoiner;
import org.springframework.util.Assert;

import java.util.List;

public class InWhere implements Where {

    @Override
    public String query(Condition condition) {
        Assert.notEmpty(condition.getValues(), "조건에 대한 값이 있어야 합니다.");
        Assert.isTrue(condition.getValues().size() > 0, "조건값은 1개 이상 이어야 합니다.");

        String columnName = condition.getColumnName();
        List<String> values = condition.getValues();
        return String.format("%s = IN (%s)", columnName, ArrayJoiner.join(values, "'", "'"));
    }

}
