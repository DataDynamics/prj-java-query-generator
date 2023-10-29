package io.datadynamics.datalake.sql.controller;

import io.datadynamics.datalake.sql.model.DownloadRequest;
import io.datadynamics.datalake.sql.model.QueryRequest;
import io.datadynamics.datalake.sql.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RequestMapping("/api/query")
@RestController
public class QueryController {

    @Autowired
    QueryService queryService;

    @Autowired
    JdbcTemplate template;

    @PostMapping("execute")
    public ResponseEntity execute(@RequestBody QueryRequest request) {
        String query = queryService.generateQuery(request);
        List<Map<String, Object>> maps = template.queryForList(query);
        return ResponseEntity.ok(maps);
    }

    @PostMapping("download")
    public ResponseEntity download(@RequestBody DownloadRequest request) {
        return ResponseEntity.ok().build();
    }

}
