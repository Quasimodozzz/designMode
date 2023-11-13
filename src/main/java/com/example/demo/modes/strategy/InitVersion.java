package com.example.demo.modes.strategy;

import com.example.demo.modes.strategy.service.FoodService;
import com.example.demo.modes.strategy.service.HotelService;
import com.example.demo.modes.strategy.service.WaimaiService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


public class InitVersion {
    private WaimaiService waimaiService;
    private FoodService foodService;
    private HotelService hotelService;
    void serve(String type){
        if("waimai".equals(type)) waimaiService.serve();
        else if ("food".equals(type)) foodService.serve();
        else if ("hotel".equals(type)) hotelService.serve();
        else throw new IllegalArgumentException("type error!");
    }


}
