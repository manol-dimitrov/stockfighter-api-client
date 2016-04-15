package projects.stockfighter.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import projects.stockfighter.client.configuration.ApplicationConfiguration;

@Import(ApplicationConfiguration.class)
@EnableAutoConfiguration
@ComponentScan
public class StockFighterApiClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(StockFighterApiClientApplication.class, args);
    }
}
