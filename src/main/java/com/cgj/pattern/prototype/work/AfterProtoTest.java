package com.cgj.pattern.prototype.work;

import java.util.Date;

public class AfterProtoTest {
    public static void main(String[] args) {
        ReResult reResult = new ReResult();
        reResult.setAdvice("justtest");
        reResult.setCallNum("123456");
        reResult.setContent("asdfasfasf");


        //没有优化之前，没增加一个字段都需要修改genericFrom方法
        ReResultVo reResultVo = ReResultVo.genericFrom(reResult);

        System.out.println(reResultVo.toString());

        ReResult reResultAfter = new ReResult();
        reResultAfter.setAdvice("justtest");
        reResultAfter.setCallNum("123456");
        reResultAfter.setContent("asdfasfasf");
        //因为包含一个转换所以这个属性必须设值
        reResultAfter.setResultTime(new Date());
        ReResultVo reResultVoAfter = ReResultVoProto.genericFrom(reResultAfter);
        System.out.println(reResultVoAfter.toString());
    }
}
