package org.stockfighter.client.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Manol on 31/01/2016.
 */
@org.springframework.context.annotation.Configuration
public class Configuration {

    private final static String API_KEY = "c457e5bbfbd2d18cc9814f2cf9a399c98dc2a809";

    private List<ClientHttpRequestInterceptor> interceptors;

    public List<ClientHttpRequestInterceptor> initialiseHttpInterceptors() {
        interceptors = new ArrayList<>();
        interceptors.add(new HeaderRequestInterceptor("Accept", MediaType.APPLICATION_JSON_VALUE));
        interceptors.add(new HeaderRequestInterceptor("X-Starfighter-Authorization", API_KEY));
        return interceptors;
    }

    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setInterceptors(initialiseHttpInterceptors());
        return new RestTemplate();
    }
}
