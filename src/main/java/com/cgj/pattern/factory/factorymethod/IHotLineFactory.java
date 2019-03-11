package com.cgj.pattern.factory.factorymethod;

import com.cgj.pattern.factory.IHotLine;

public interface IHotLineFactory {
    IHotLine createHotLine() throws Exception;
}
