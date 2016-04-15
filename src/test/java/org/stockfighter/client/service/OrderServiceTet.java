package org.stockfighter.client.service;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.stockfighter.client.configuration.TestConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(value = TestConfiguration.class)
public class OrderServiceTet {
    @Autowired
    OrderService orderService;
}
