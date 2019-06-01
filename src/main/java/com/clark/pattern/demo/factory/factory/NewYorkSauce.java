package com.clark.pattern.demo.factory.factory;

/**
 * created by LuChang
 * 2019/6/1 17:38
 */
public class NewYorkSauce extends Sauce {

    public NewYorkSauce() {
        this.name = "New York sauce";
    }

    @Override
    public void describe() {
        System.out.println(this.name);
    }
}
