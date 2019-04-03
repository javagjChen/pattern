package com.cgj.pattern.decorator;

public class BaseBeefNoodle extends BeefNoodle{

    @Override
    public String getMsg() {

        return "牛肉面";
    }

    @Override
    public int getPrice() {
        return 10;
    }
}
