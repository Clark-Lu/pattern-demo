package com.clark.pattern.demo.factory.factory;

/**
 * created by LuChang
 * 2019/6/1 17:42
 */
public class NewYorkSauceFactory extends SauceFactory {
    @Override
    public Sauce createSauce() {
        System.out.println("create New York sauce");
        return new NewYorkSauce();
    }
}
