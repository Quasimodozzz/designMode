package com.example.demo.modes.strategy.v1;

import com.example.demo.modes.strategy.service.HotelService;

public class Hotel implements Strategy{
    private HotelService hotelService;
    @Override
    public void issue() {
        hotelService.serve();
    }
}
