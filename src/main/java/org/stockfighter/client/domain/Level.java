package org.stockfighter.client.domain;

import lombok.Data;

import java.util.List;

@Data
public class Level {
    private String account;
    private String instanceId;
    private List<String> instructions;
    private String success;
    private int secondsPerTradingDay;
    private List<String> tickers;
    private List<String> venues;
    private List<String> balances;
}
