package io.datadynamics.datalake.sql.service.where;

import io.datadynamics.datalake.sql.model.Condition;

public interface Where {

    String query(Condition condition);

}
