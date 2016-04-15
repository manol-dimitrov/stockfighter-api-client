package projects.stockfighter.client.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import projects.stockfighter.client.configuration.TestConfiguration;
import projects.stockfighter.client.domain.Quote;
import projects.stockfighter.client.domain.Stock;
import projects.stockfighter.client.domain.Venue;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(value = TestConfiguration.class)
public class QuoteServiceTest {

    @Autowired
    QuoteService quoteService;
    Stock stock;
    Venue venue;

    @Before
    public void setUp() {
        stock = mock(Stock.class);
        venue = mock(Venue.class);
    }

    @Test
    public void shouldGetLatestQuoteForStock() {
        when(stock.getSymbol()).thenReturn("SDS");
        when(venue.getSymbol()).thenReturn("BAIMEX");
        Quote expected = quoteService.getLatestQuote(venue, stock);
        assertNotNull(expected);
    }
}
