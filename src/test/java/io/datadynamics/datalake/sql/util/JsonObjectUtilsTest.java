package io.datadynamics.datalake.sql.util;

import io.datadynamics.datalake.sql.model.QueryRequest;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;

public class JsonObjectUtilsTest {

    public static void main(String[] args) throws Exception {
//        DefaultResourceLoader loader = new DefaultResourceLoader();
//        Resource resource = loader.getResource("classpath:download_request.json");
//        JsonObjectUtils.convertJsonToJavaClass(resource, "target", "io.datadynamics.datalake.sql.model", "DownloadRequest");

        QueryRequest queryRequest = JsonObjectUtils.marshalQueryRequest("classpath:query_request.json");
        System.out.println(queryRequest);
    }

}