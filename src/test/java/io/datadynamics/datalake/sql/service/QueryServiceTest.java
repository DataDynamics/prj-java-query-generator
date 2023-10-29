package io.datadynamics.datalake.sql.service;

import io.datadynamics.datalake.sql.model.QueryRequest;
import io.datadynamics.datalake.sql.util.JsonObjectUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class QueryServiceTest {

    @Test
    public void queryGenerate() throws IOException {
        QueryRequest queryRequest = JsonObjectUtils.marshalQueryRequest("classpath:query_request.json");

        QueryService service = new QueryService();
        String query = service.generateQuery(queryRequest);

        System.out.println(query);
    }

}