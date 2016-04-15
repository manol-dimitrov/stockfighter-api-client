package org.stockfighter.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.stockfighter.client.domain.Level;

import java.util.HashMap;
import java.util.Map;

@Component
public class LevelStarter {

    @Value("${api-key}")
    private String apiKey;

    @Value("${level-starter-api}")
    private String levelStarterUri;

    @Autowired
    private RestTemplate restTemplate;

    public Level startAlevel(String levelName) {
        ResponseEntity<Level> levelResponseEntity = restTemplate.postForEntity(levelStarterUri + levelName, levelName, Level.class, headerValues());
        return levelResponseEntity.getBody();
    }

    public void restartAlevel(String instance) {

    }

    private Map<String, String> headerValues() {
        Map<String, String> header = new HashMap<>();
        header.put("Cookie:api_key=", apiKey);
        return header;
    }

}
