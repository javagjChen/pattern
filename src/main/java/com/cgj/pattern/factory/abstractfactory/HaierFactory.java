package com.cgj.pattern.factory.abstractfactory;

public class HaierFactory implements IFactory {
    public IIceBox makeIceBox() throws Exception {
        return new HaierIceBox();
    }

    public IAC makeAC() throws Exception {
        return new HaierAC();
    }


}
