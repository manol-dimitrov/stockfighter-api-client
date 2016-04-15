package projects.stockfighter.client.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * Created by Manol on 31/01/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Quote {
    private boolean okStatus;
    private String stock;
    private String venue;
    private long bid;
    private long ask;
    private long bidSize;
    private long askSize;
    private long bidDepth;
    private long askDepth;
    private long lastPrice;
    private long lastSize;
    private String lastTrade;
    private String quoteTime;
}
