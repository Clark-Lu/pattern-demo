package com.clark.pattern.demo.factory.factory;

/**
 * created by LuChang
 * 2019/6/1 17:39
 */
public class ChicagoSauce extends Sauce {

    public ChicagoSauce() {
        this.name = "Chicago sauce";
    }

    @Override
    public void describe() {
        System.out.println(this.name);
    }
}
