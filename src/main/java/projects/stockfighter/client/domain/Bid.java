package projects.stockfighter.client.domain;

import lombok.Data;

/**
 * Created by Manol on 31/01/2016.
 */
@Data
public class Bid {
    private long price;
    private int quantity;
    private boolean isBuy;
}
