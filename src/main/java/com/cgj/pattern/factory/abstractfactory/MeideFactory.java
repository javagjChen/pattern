package com.cgj.pattern.factory.abstractfactory;

public class MeideFactory implements IFactory {
    public IIceBox makeIceBox() throws Exception {
        return new MeiDeIceBox();
    }

    public IAC makeAC() throws Exception {
        return new MeideAC();
    }


}
