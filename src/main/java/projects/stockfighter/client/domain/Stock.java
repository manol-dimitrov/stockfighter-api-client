package projects.stockfighter.client.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * Created by Manol on 31/01/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = false)
@Data
public class Stock {
    private String symbol;
}
