package com.cgj.pattern.singleton.hungry;

public class HungryStaticSingleton {
    private HungryStaticSingleton() {}
    private static final HungryStaticSingleton instance;
    static {
        instance = new HungryStaticSingleton();
    }
    public static HungryStaticSingleton getInstance(){
        return instance;
    }
}