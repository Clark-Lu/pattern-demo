package com.clark.pattern.demo.factory.simple;

import com.clark.pattern.demo.factory.pizza.CheesePizza;
import com.clark.pattern.demo.factory.pizza.Pizza;

/**
 * created by LuChang
 * 2019/6/1 15:50
 */
public class SimpleStaticFactory {

    public static Pizza createPizza(String pizzaName){
        if ("cheesePizza".equals(pizzaName)){
            return new CheesePizza();
        }
        return null;
    }

}
