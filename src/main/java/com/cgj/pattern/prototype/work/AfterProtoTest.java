package com.cgj.pattern.prototype.work;

import com.cgj.pattern.prototype.JinGuBang;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class AfterProtoTest {
    public static void main(String[] args) {
        ReResult reResult = new ReResult();
        reResult.setAdvice("justtest");
        reResult.setCallNum("123456");
        reResult.setContent("asdfasfasf");

        //没有优化之前，没增加一个字段都需要修改genericFrom方法
        ReResultVo reResultVo = ReResultVo.genericFrom(reResult);

        //System.out.println(reResultVo.toString());
        //System.out.println(reResult.getJinGuBang().toString());
        //System.out.println(reResultVo.getJinGuBang().toString());
        //System.out.println(reResultVo.getJinGuBang() ==  reResult.getJinGuBang());

        ReResult reResultAfter = new ReResult();
        reResultAfter.setAdvice("justtest");
        reResultAfter.setCallNum("123456");
        reResultAfter.setContent("asdfasfasf");
        //因为包含一个转换所以这个属性必须设值
        reResultAfter.setResultTime(new Date());
        Set<JinGuBang> set = new HashSet<JinGuBang>();
        set.add(new JinGuBang());
        set.add(new JinGuBang());
        reResultAfter.setJinGuBang(set);
        ReResultVo reResultVoAfter = ReResultVoProto.genericFrom(reResultAfter);
        System.out.println(reResultAfter.getJinGuBang().toString());
        System.out.println(reResultVoAfter.getJinGuBang().toString());

        System.out.println(reResultAfter.getJinGuBang() == reResultVoAfter.getJinGuBang());
    }
}
