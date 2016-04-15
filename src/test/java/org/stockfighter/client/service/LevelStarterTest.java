package org.stockfighter.client.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.stockfighter.client.configuration.TestConfiguration;
import org.stockfighter.client.domain.Level;

import static org.hamcrest.CoreMatchers.isA;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(value = TestConfiguration.class)
@PropertySource("classpath:application.properties")
public class LevelStarterTest {

    @Autowired
    private LevelStarter levelStarter;

    @Test
    public void shouldStartAgivenLevel() {
        Level level = levelStarter.startAlevel("first_steps");
        assertThat(level, isA(Level.class));
    }
}
