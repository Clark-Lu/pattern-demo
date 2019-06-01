package com.clark.pattern.demo.factory.factory;

/**
 * created by LuChang
 * 2019/6/1 17:43
 */
public class ChicagoSauceFactory extends SauceFactory {
    @Override
    public Sauce createSauce() {
        System.out.println("create Chicago sauce");
        return new ChicagoSauce();
    }
}
