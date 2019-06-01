package com.clark.pattern.demo.decorator.decorator;

import com.clark.pattern.demo.decorator.Beverage;

/**
 * created by LuChang
 * 2019/6/1 14:10
 */
public class Milk extends Decorator {


    public Milk(Beverage beverage) {
        super(beverage);
        this.description = "milk";
    }

    @Override
    public String getDescription() {
        if (beverage != null) {
            return this.beverage.getDescription() + " extra " + this.description;
        }else {
            return this.description;
        }
    }

    @Override
    public double cost() {
        if (beverage != null) {
            return this.beverage.cost() + 2.0;
        }else {
            return 2.0;
        }
    }
}
