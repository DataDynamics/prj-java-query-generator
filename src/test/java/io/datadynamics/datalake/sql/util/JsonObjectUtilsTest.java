package io.datadynamics.datalake.sql.util;

import io.datadynamics.datalake.sql.model.QueryRequest;

public class JsonObjectUtilsTest {

    public static void main(String[] args) throws Exception {
//        DefaultResourceLoader loader = new DefaultResourceLoader();
//        Resource resource = loader.getResource("classpath:query_request.json");
//        JsonObjectUtils.convertJsonToJavaClass(resource, "target", "io.datadynamics.datalake.sql.model", "QueryRequest");

        QueryRequest queryRequest = JsonObjectUtils.marshalQueryRequest("classpath:query_request.json");
        System.out.println(queryRequest);
    }

}