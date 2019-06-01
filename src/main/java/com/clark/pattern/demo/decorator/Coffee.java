package com.clark.pattern.demo.decorator;

/**
 * created by LuChang
 * 2019/6/1 14:15
 */
public class Coffee extends Beverage {

    public Coffee() {
        this.description = "coffee";
    }

    @Override
    public double cost() {
        return 10.0;
    }
}
