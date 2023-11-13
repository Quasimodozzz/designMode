package com.example.demo.modes.strategy.v1;

import com.example.demo.modes.strategy.service.WaimaiService;

public class Waimai implements Strategy{
    private WaimaiService waimaiService;
    @Override
    public void issue() {
        waimaiService.serve();
    }
}
