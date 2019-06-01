package com.clark.pattern.demo.decorator.decorator;

import com.clark.pattern.demo.decorator.Beverage;

/**
 * created by LuChang
 * 2019/6/1 15:11
 */
public class Sugar extends Decorator {

    public Sugar(Beverage beverage) {
        super(beverage);
        this.description = "sugar";
    }

    @Override
    public String getDescription() {
        if (beverage != null) {
            return beverage.getDescription() + " extra " + this.description;
        }else {
            return this.description;
        }
    }

    @Override
    public double cost() {
        if (beverage != null){
            return beverage.cost() + 0;
        }else {
            return 0;
        }
    }
}
