package com.cgj.pattern.factory.simplefactory;

import com.cgj.pattern.factory.IHotLine;

public class HotLineFactory {
    public IHotLine createHotLine(Class<? extends IHotLine> iHotLine){

        try {

            if (iHotLine != null) {
                return iHotLine.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
