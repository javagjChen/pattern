package com.cgj.pattern.factory.abstractfactory;

public class AbstractFactoryTest {


    public static void main(String[] args) {
        IFactory factory = new HaierFactory();
        try {
            factory.makeAC().cold();
            factory.makeIceBox().keepFlesh();
            factory = new MeideFactory();
            factory.makeIceBox().keepFlesh();
            factory.makeAC().cold();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
