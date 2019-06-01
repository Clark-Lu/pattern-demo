package com.clark.pattern.demo.factory.subclasses;

import com.clark.pattern.demo.factory.pizza.Pizza;
import com.clark.pattern.demo.factory.simple.SimpleStaticFactory;

/**
 * created by LuChang
 * 2019/6/1 16:13
 */
public class NewYorkPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String pizzaName) {
        System.out.println("New York style pizza");
        return SimpleStaticFactory.createPizza(pizzaName);
    }
}
