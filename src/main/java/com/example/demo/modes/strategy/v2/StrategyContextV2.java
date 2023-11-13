package com.example.demo.modes.strategy.v2;

import com.example.demo.modes.strategy.v1.Strategy;

import java.util.HashMap;

public class StrategyContextV2 {
    private static HashMap<String, Strategy> map = new HashMap<>();
    //注册策略
    public static void register(String type,Strategy strategy){
        map.putIfAbsent(type,strategy);
    }
    //获得策略
    public static Strategy getStrategy(String type){
        return map.get(type);
    }
}
