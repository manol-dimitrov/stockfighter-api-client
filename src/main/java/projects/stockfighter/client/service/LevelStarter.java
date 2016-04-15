package projects.stockfighter.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import projects.stockfighter.client.domain.Level;

import java.util.HashMap;
import java.util.Map;

@Component
public class LevelStarter {

    private String apiKey;
    private String levelStarterUri;
    private String levelRestartUri;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    public LevelStarter(@Value("${api-key}") String apiKey,
                        @Value("${level-starter-uri}") String levelStarterUri,
                        @Value("${level-restarter-uri}") String levelRestartUri) {
        this.apiKey = apiKey;
        this.levelStarterUri = levelStarterUri;
        this.levelRestartUri = levelRestartUri;
    }

    public String getApiKey() {
        return apiKey;
    }

    public String getLevelStarterUri() {
        return levelStarterUri;
    }

    public Level startAlevel(String levelName) {
        ResponseEntity<Level> levelResponseEntity = restTemplate.postForEntity(levelStarterUri + levelName, levelName, Level.class, headerValues());
        return levelResponseEntity.getBody();
    }

    public void restartAlevel(Level level) {
        String instanceId = level.getInstanceId();
        restTemplate.postForEntity(levelRestartUri + instanceId, instanceId, Object.class, headerValues());
    }

    private Map<String, String> headerValues() {
        Map<String, String> header = new HashMap<>();
        header.put("Cookie:api_key=", apiKey);
        return header;
    }

}
