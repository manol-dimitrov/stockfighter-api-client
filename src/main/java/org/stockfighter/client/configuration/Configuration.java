package org.stockfighter.client.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Manol on 31/01/2016.
 */
@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
