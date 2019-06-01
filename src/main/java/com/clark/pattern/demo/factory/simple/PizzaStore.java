package com.clark.pattern.demo.factory.simple;

import com.clark.pattern.demo.factory.pizza.Pizza;

/**
 * created by LuChang
 * 2019/6/1 15:49
 */
public class PizzaStore {

    public Pizza orderPizza(String pizzaName){
        Pizza pizza = SimpleStaticFactory.createPizza(pizzaName);
        pizza.bake();
        return pizza;
    }

}
