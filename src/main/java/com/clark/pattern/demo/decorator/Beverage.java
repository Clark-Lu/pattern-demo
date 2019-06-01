package com.clark.pattern.demo.decorator;

/**
 * created by LuChang
 * 2019/6/1 14:05
 */
public abstract class Beverage {

    protected String description = "unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
