package com.clark.pattern.demo.template;

/**
 * created by LuChang
 * 2019/6/3 17:22
 */
public class Tea extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("brew tea");
    }

    @Override
    void addCondiment() {
        System.out.println("add lemon");
    }
}
