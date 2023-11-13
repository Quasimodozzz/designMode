package com.example.demo.modes.strategy.v1;

public class Serv {
    public void reward(String type){
        Strategy strategy = StrategyContext.getStrategy(type);
        strategy.issue();
    }
}
