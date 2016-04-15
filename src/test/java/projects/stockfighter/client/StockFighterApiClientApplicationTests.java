package projects.stockfighter.client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import projects.stockfighter.client.configuration.TestConfiguration;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasToString;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TestConfiguration.class)
public class StockFighterApiClientApplicationTests {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void shouldReturnOkWhenStockFighterApiIsUp() {
        HttpHeaders httpHeaders = restTemplate.getForEntity("https://api.stockfighter.io/ob/api/heartbeat", String.class).getHeaders();

        httpHeaders.entrySet().stream().forEach(stringListEntry -> System.out.println(stringListEntry.getKey()));
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("https://api.stockfighter.io/ob/api/heartbeat", String.class);

        assertThat(responseEntity.getBody(), hasToString("{\"ok\":true,\"error\":\"\"}"));
    }
}
