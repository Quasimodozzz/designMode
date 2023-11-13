package com.example.demo.modes.strategy.v2;

import com.example.demo.modes.strategy.service.WaimaiService;
import com.example.demo.modes.strategy.v1.Strategy;

public class WaimaiV2 extends AbstractStrategy implements Strategy {
    //静态常量实现饿汉式单例
    private static final WaimaiV2 instance = new WaimaiV2();

    private WaimaiService waimaiService;
    //无参构造时自动注册
    private WaimaiV2(){
        register();
    }

    public static WaimaiV2 getInstance(){
        return instance;
    }
    @Override
    public void issue() {

    }
}
