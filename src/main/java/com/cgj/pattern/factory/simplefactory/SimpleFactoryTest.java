package com.cgj.pattern.factory.simplefactory;

import com.cgj.pattern.factory.DongguanHotLine;
import com.cgj.pattern.factory.ZhuhaiHotLine;

public class SimpleFactoryTest {

    public static void main(String[] args) {
        HotLineFactory factory = new HotLineFactory();
        try {
            factory.createHotLine(DongguanHotLine.class).callFunc();
            factory.createHotLine(ZhuhaiHotLine.class).callFunc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
