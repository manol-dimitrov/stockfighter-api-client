package org.stockfighter.client.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

/**
 * Created by Manol on 31/01/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Venue {
    private String symbol;
    private List<Stock> stockOnVenue;
}
