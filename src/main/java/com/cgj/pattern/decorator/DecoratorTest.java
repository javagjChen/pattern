package com.cgj.pattern.decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        BeefNoodle beefNoodle = new BaseBeefNoodle();
        beefNoodle = new DecoratorBeefNoodle(beefNoodle);

        System.out.println(beefNoodle.getMsg() + " 总价 " + beefNoodle.getPrice());

        beefNoodle = new EggBeefNoodle(beefNoodle);
        beefNoodle = new EggBeefNoodle(beefNoodle);
        beefNoodle = new EggBeefNoodle(beefNoodle);
        System.out.println(beefNoodle.getMsg() + " 总价 " + beefNoodle.getPrice());

    }
}
