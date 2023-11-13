package com.example.demo.modes.strategy.v1;

//环境类-适配器
public class StrategyContext {
    public static Strategy getStrategy(String type){
        switch (type){
            case "waimai":
                return new Waimai();
            case "food":
                return new Food();
            case "hotel":
                return new Hotel();
            default:
                throw new IllegalArgumentException("type error!");
        }
    }
}
