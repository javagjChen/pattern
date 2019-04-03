package com.cgj.pattern.decorator;

public class EggBeefNoodle extends DecoratorBeefNoodle {

    public EggBeefNoodle(BeefNoodle beefNoodle) {
        super(beefNoodle);
    }

    @Override
    public String getMsg() {
        return super.getMsg() + " 加 1个鸡蛋";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 2;
    }
}
