package com.clark.pattern.demo.decorator.decorator;

import com.clark.pattern.demo.decorator.Beverage;

/**
 * created by LuChang
 * 2019/6/1 14:07
 */
public abstract class Decorator extends Beverage {
    
    protected Decorator(Beverage beverage) {
        this.beverage = beverage;
    }

    protected Beverage beverage;

    public abstract String getDescription();
}
