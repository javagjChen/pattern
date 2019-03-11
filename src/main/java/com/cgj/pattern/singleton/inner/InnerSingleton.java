package com.cgj.pattern.singleton.inner;

public class InnerSingleton {


    private InnerSingleton (){
        if (HolderInnerSingleton.intance != null){
            throw new RuntimeException("我是防反射攻击的，乖乖通过正常方式创建，不要装B");
        }
    }



    public static InnerSingleton getIntance(){
        return HolderInnerSingleton.intance;
    }

    private static class HolderInnerSingleton {
        private static final InnerSingleton intance = new InnerSingleton();
    }
}
