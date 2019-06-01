package com.clark.pattern.demo.factory.factory;

/**
 * created by LuChang
 * 2019/6/1 17:49
 */
public class FactoryTest {
    public static void main(String[] args) {
        SauceFactory newYorkSauceFactory = new NewYorkSauceFactory();
        SauceFactory chicagoSauceFactory = new ChicagoSauceFactory();
        Pizza newYorkPizza = new NewYorkPizza(newYorkSauceFactory);
        Pizza chicagoPizza = new ChicagoPizza(chicagoSauceFactory);
        newYorkPizza.bake();
        chicagoPizza.bake();
    }
}
