package org.stockfighter.client.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by Manol on 31/01/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public @Data
class Bid {
    private BigDecimal price;
    private int quantity;
    private boolean isBuy;
}
