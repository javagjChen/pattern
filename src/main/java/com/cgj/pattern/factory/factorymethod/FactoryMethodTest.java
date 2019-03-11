package com.cgj.pattern.factory.factorymethod;

public class FactoryMethodTest {

    public static void main(String[] args) {
        IHotLineFactory factory = new DongguanHotLineFactory();
        try {
            factory.createHotLine().callFunc();
        } catch (Exception e) {
            e.printStackTrace();
        }
        factory = new ZhuhaiHotLineFactory();
        try {
            factory.createHotLine().callFunc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
