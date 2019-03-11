package com.cgj.pattern.singleton.lazy;

public class LazySingleton {

    private LazySingleton () {}

    private volatile static LazySingleton instance;

    public static LazySingleton getInstance(){
        if (instance == null){
            synchronized (LazySingleton.class){
                if (instance == null){
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
