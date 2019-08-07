package com.example.eurekaclient3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
public class TestController {

    @Value("${server.port}")
    private String portNumber;

    @GetMapping("/test")
    public ResponseEntity<Map<String, Object>> testPage() {
        log.info("portNumber: {}", portNumber);
        Map<String, Object> result = new HashMap<>();
        result.put("port", portNumber);
        return ResponseEntity.ok(result);
    }

}
