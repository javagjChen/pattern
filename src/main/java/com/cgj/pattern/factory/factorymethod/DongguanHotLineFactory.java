package com.cgj.pattern.factory.factorymethod;


import com.cgj.pattern.factory.DongguanHotLine;
import com.cgj.pattern.factory.IHotLine;

public class DongguanHotLineFactory implements IHotLineFactory {

    public IHotLine createHotLine() throws Exception {
        return new DongguanHotLine();
    }
}
