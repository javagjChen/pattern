package com.cgj.pattern.singleton.enumsingleton;

public enum EnumSingleton {
    INSTANCE;

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }

    public void fun1 () {
        //do something
        System.out.println("枚举单列");
    }
}
