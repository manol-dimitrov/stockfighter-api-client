package projects.stockfighter.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import projects.stockfighter.client.domain.Quote;
import projects.stockfighter.client.domain.Stock;
import projects.stockfighter.client.domain.Venue;

/**
 * Created by Manol on 31/01/2016.
 */
@Component
public class QuoteService {

    @Value(value = "api-key")
    private String apiKey;

    @Value(value = "venues")
    private String venuesUri;

    @Autowired
    private RestTemplate restTemplate;

    public Quote getLatestQuote(Venue venue, Stock stock) throws RestClientException {
        String url = venuesUri + venue.getSymbol() + "/stocks/" + stock.getSymbol() + "/quote";
        return restTemplate.getForObject(url, Quote.class);
    }

}
