package io.datadynamics.datalake.sql.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.codemodel.JCodeModel;
import io.datadynamics.datalake.sql.model.QueryRequest;
import org.jsonschema2pojo.*;
import org.jsonschema2pojo.rules.RuleFactory;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class JsonObjectUtils {

    private static ResourceLoader loader = new DefaultResourceLoader();
    private static ObjectMapper mapper = new ObjectMapper();

    public static QueryRequest marshalQueryRequest(String resourceLocation) throws IOException {
        Resource resource = loader.getResource(resourceLocation);
        return mapper.readValue(resource.getFile(), QueryRequest.class);
    }

    public static void convertJsonToJavaClass(Resource input, String outputJavaClassDirectory, String packageName, String javaClassName) throws IOException {
        convertJsonToJavaClass(input.getURL(), new File(outputJavaClassDirectory), packageName, javaClassName);
    }

    public static void convertJsonToJavaClass(URL inputJsonUrl, File outputJavaClassDirectory, String packageName, String javaClassName) throws IOException {
        JCodeModel jcodeModel = new JCodeModel();

        GenerationConfig config = new DefaultGenerationConfig() {
            @Override
            public boolean isGenerateBuilders() {
                return true;
            }

            @Override
            public SourceType getSourceType() {
                return SourceType.JSON;
            }
        };

        SchemaMapper mapper = new SchemaMapper(new RuleFactory(config, new Jackson2Annotator(config), new SchemaStore()), new SchemaGenerator());
        mapper.generate(jcodeModel, javaClassName, packageName, inputJsonUrl);

        jcodeModel.build(outputJavaClassDirectory);
    }

}