package com.clark.pattern.demo.factory.factory;

/**
 * created by LuChang
 * 2019/6/1 17:46
 */
public class NewYorkPizza extends Pizza {

    public NewYorkPizza(SauceFactory sauceFactory) {
        super(sauceFactory);
    }

    @Override
    protected void prepare() {
        this.sauce = this.sauceFactory.createSauce();
    }
}
