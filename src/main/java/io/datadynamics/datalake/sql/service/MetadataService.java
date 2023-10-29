package io.datadynamics.datalake.sql.service;

import io.datadynamics.datalake.sql.model.Column;
import io.datadynamics.datalake.sql.model.Metadata;

public class MetadataService {

    public Metadata getMetadata(String tableName) {
        Metadata metadata = new Metadata();
        metadata.setTableName(tableName);
        metadata.getColumns().add(new Column().withColumnName("A").withDataType("INTEGER").withPartition(false).withRequired(false));
        metadata.getColumns().add(new Column().withColumnName("B").withDataType("VARCHAR").withPartition(false).withRequired(false));
        metadata.getColumns().add(new Column().withColumnName("C").withDataType("TIMESTAMP").withPartition(true).withRequired(true));
        return metadata;
    }

}
