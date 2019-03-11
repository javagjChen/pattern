package com.cgj.pattern.factory.factorymethod;

import com.cgj.pattern.factory.IHotLine;
import com.cgj.pattern.factory.ZhuhaiHotLine;

public class ZhuhaiHotLineFactory implements IHotLineFactory {
    public IHotLine createHotLine() throws Exception {
        return new ZhuhaiHotLine();
    }
}
