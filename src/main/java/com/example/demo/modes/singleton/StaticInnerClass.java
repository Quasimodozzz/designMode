package com.example.demo.modes.singleton;

public class StaticInnerClass {
    //静态内部类，懒汉式
    private StaticInnerClass(){}
    private static class GetInstance{
        static StaticInnerClass instance = new StaticInnerClass();
    }

    public static StaticInnerClass getInstance(){
        return GetInstance.instance;
    }
}
