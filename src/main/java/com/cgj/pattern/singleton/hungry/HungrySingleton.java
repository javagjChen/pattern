package com.cgj.pattern.singleton.hungry;

public class HungrySingleton {

    /**
     * 构造方法私有，防止继承
     */
    protected HungrySingleton(){}

    private static final HungrySingleton instance = new HungrySingleton();
    public static HungrySingleton getInstance(){
        return instance;
    }
}