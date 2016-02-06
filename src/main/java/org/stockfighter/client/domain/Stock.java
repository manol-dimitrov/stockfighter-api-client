package org.stockfighter.client.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

/**
 * Created by Manol on 31/01/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Stock {
    private String symbol;
}
