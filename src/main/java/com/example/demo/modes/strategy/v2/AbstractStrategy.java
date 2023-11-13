package com.example.demo.modes.strategy.v2;

import com.example.demo.modes.strategy.v1.Strategy;

abstract class AbstractStrategy implements Strategy {
    public void register(){
        StrategyContextV2.register(getClass().getSimpleName(),this);
    }
}
