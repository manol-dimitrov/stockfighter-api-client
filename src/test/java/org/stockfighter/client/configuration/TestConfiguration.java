package org.stockfighter.client.configuration;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Manol on 31/01/2016.
 */
@SpringBootApplication
@ComponentScan(basePackages = "org.stockfighter.client")
public class TestConfiguration {
    @Bean
    public TestRestTemplate testRestTemplate(){
        return new TestRestTemplate();
    }
}
