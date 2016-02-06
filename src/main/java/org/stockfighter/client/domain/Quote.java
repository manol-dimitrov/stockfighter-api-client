package org.stockfighter.client.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Manol on 31/01/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode
public class Quote {
    @Getter
    @Setter
    private boolean okStatus;
    @Getter
    @Setter
    private Stock stock;
    @Getter
    @Setter
    private Venue venue;
    @Getter
    @Setter
    private Bid bid;
    @Getter
    @Setter
    private Bid ask;
    @Getter
    @Setter
    private long bidSize;
    @Getter
    @Setter
    private long askSize;
    @Getter
    @Setter
    private long bidDepth;
    @Getter
    @Setter
    private long askDepth;

    public Quote(){

    }
}
