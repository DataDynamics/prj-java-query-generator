package io.datadynamics.datalake.sql.service.where;

import io.datadynamics.datalake.sql.model.Condition;

import java.util.HashMap;
import java.util.Map;

public class WhereMap {

    public static Map<String, Where> wheres = new HashMap<>();

    static {
        wheres.put("IN", new InWhere());
        wheres.put("EQUAL", new EqualWhere());
        wheres.put("BETWEEN", new BetweenWhere());
    }

    public static Where getWhere(Condition condition) {
        return wheres.get(condition.getOperator());
    }

}