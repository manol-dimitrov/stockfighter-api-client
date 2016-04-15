package projects.stockfighter.client.domain;

import lombok.Data;

import java.util.List;

/**
 * Created by Manol on 31/01/2016.
 */
@Data
public class Venue {
    private String symbol;
    private List<Stock> stockOnVenue;
}
