package io.datadynamics.datalake.sql.util;

import com.google.common.base.Joiner;

import java.util.ArrayList;
import java.util.List;

public class ArrayJoiner {

    public static String join(List<String> values, String open, String close) {
        List<String> joinValues = new ArrayList<>();
        for (String value : values) {
            joinValues.add(String.format("%s%s%s", open, value, close));
        }
        return Joiner.on(", ").join(joinValues);
    }

}
