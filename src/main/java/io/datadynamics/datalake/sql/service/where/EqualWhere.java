package io.datadynamics.datalake.sql.service.where;

import io.datadynamics.datalake.sql.model.Condition;
import org.springframework.util.Assert;

import java.util.List;

public class EqualWhere implements Where {

    @Override
    public String query(Condition condition) {
        Assert.notEmpty(condition.getValues(), "조건에 대한 값이 있어야 합니다.");
        Assert.isTrue(condition.getValues().size() == 1, "조건값은 1개 이어야 합니다.");

        String columnName = condition.getColumnName();
        List<String> values = condition.getValues();
        return String.format("%s = '%s'", columnName, values.get(0));
    }

}
