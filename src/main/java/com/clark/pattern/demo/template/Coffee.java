package com.clark.pattern.demo.template;

/**
 * created by LuChang
 * 2019/6/3 17:24
 */
public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("brew coffee");
    }

    @Override
    void addCondiment() {
        System.out.println("add milk and sugar");
    }
}
