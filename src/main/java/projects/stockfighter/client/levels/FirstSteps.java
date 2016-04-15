package projects.stockfighter.client.levels;

import org.apache.catalina.valves.rewrite.Substitution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import projects.stockfighter.client.domain.*;
import projects.stockfighter.client.service.LevelStarter;
import projects.stockfighter.client.service.OrderService;
import projects.stockfighter.client.service.QuoteService;

@Component
public class FirstSteps {
    @Autowired
    private LevelStarter levelStarter;

    @Autowired
    private QuoteService quoteService;

    @Autowired
    private OrderService orderService;

    public void startLevel(){
        Level firstStepsLevel = levelStarter.startAlevel("first_steps");
    }

    public void placeOrder(Venue venue, Stock stock, Order order){
        Quote quote = getQuote(venue, stock);
        while(quote.getLastPrice() < order.getPrice()){
            orderService.placeOrder();
        }
    }

    public Quote getQuote(Venue venue, Stock stock){
        Quote latestQuote = quoteService.getLatestQuote(venue, stock);
        return latestQuote;
    }
}
