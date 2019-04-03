package com.cgj.pattern.decorator;

public class DecoratorBeefNoodle extends BeefNoodle {

    private  BeefNoodle beefNoodle = null;

    public DecoratorBeefNoodle(BeefNoodle beefNoodle) {
        this.beefNoodle = beefNoodle;
    }



    @Override
    public String getMsg() {
        return beefNoodle.getMsg();
    }

    @Override
    public int getPrice() {
        return beefNoodle.getPrice();
    }
}
