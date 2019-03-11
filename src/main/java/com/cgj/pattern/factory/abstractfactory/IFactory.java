package com.cgj.pattern.factory.abstractfactory;

public interface IFactory {

    IIceBox makeIceBox() throws Exception;

    IAC makeAC() throws Exception;

}
