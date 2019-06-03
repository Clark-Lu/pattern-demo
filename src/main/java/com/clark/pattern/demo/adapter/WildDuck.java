package com.clark.pattern.demo.adapter;

/**
 * created by LuChang
 * 2019/6/3 16:32
 */
public class WildDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("quack quack");
    }

    @Override
    public void fly() {
        System.out.println("duck fly");
    }
}
