package com.example.demo.modes.strategy.v1;

import com.example.demo.modes.strategy.service.FoodService;

public class Food implements Strategy{
    private FoodService foodService;
    @Override
    public void issue() {
        foodService.serve();
    }
}
