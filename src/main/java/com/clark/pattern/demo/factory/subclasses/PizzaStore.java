package com.clark.pattern.demo.factory.subclasses;

import com.clark.pattern.demo.factory.pizza.Pizza;

/**
 * created by LuChang
 * 2019/6/1 16:11
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String pizzaName){
        Pizza pizza = createPizza(pizzaName);
        pizza.bake();
        return pizza;
    }

    protected abstract Pizza createPizza(String pizzaName);

}
