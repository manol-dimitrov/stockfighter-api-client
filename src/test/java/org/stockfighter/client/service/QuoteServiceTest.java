package org.stockfighter.client.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.stockfighter.client.configuration.TestConfiguration;
import org.stockfighter.client.domain.Quote;
import org.stockfighter.client.domain.Stock;
import org.stockfighter.client.domain.Venue;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Manol on 31/01/2016.
 */
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
        when(stock.getSymbol()).thenReturn("HFSC");
        when(venue.getSymbol()).thenReturn("TFEX");
        Quote expected = quoteService.getLatestQuote(venue, stock);
        assertNotNull(expected);
    }
}
