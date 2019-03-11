package com.cgj.pattern.singleton.threadlocal;

public class ThreadLocalSingleton {

    private ThreadLocalSingleton () {}

    private static final ThreadLocal<ThreadLocalSingleton> threadLocal =
            new ThreadLocal<ThreadLocalSingleton>(){
                @Override
                protected ThreadLocalSingleton initialValue(){
                    return new ThreadLocalSingleton();
                }
            };

    public static ThreadLocalSingleton getIntance(){
        return threadLocal.get();
    }
}
