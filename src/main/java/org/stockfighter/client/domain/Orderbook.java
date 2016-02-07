package org.stockfighter.client.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

/**
 * Created by Manol on 31/01/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Orderbook {
    private Venue venue;
    private String symbol;
    private List<Bid> bidList;
}
