package com.clark.pattern.demo.factory.factory;

/**
 * created by LuChang
 * 2019/6/1 17:48
 */
public class ChicagoPizza extends Pizza {

    public ChicagoPizza(SauceFactory sauceFactory) {
        super(sauceFactory);
    }

    @Override
    protected void prepare() {
        this.sauce = sauceFactory.createSauce();
    }
}
