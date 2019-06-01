package com.clark.pattern.demo.factory.factory;

/**
 * created by LuChang
 * 2019/6/1 17:44
 */
public abstract class Pizza {

    protected SauceFactory sauceFactory;

    protected Sauce sauce;

    public Pizza(SauceFactory sauceFactory) {
        this.sauceFactory = sauceFactory;
    }

    public Pizza bake(){
        prepare();
        return this;
    }

    protected abstract void prepare();
}
