package com.clark.pattern.demo.factory.pizza;

/**
 * created by LuChang
 * 2019/6/1 15:48
 */
public class CheesePizza implements Pizza {
    @Override
    public void bake() {
        System.out.println("bake cheese pizza");
    }
}
