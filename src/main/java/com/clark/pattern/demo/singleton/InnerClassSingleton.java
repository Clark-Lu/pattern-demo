package com.clark.pattern.demo.singleton;

/**
 * created by LuChang
 * 2019/6/3 11:09
 */
public class InnerClassSingleton {


    private InnerClassSingleton() {
    }

    private static class Holder{
        static InnerClassSingleton singleton = new InnerClassSingleton();
    }

    public static InnerClassSingleton getSingleton(){
        return Holder.singleton;
    }
}
