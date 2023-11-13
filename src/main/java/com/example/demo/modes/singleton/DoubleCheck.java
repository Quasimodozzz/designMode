package com.example.demo.modes.singleton;

public class DoubleCheck {
    //双检锁，懒汉式
    private static volatile DoubleCheck instance;

    private DoubleCheck(){};
    public static DoubleCheck getInstance(){
        if(instance==null){
            synchronized (DoubleCheck.class){
                if(instance==null){
                    instance = new DoubleCheck();
                }
            }
        }
        return instance;
    }
}
