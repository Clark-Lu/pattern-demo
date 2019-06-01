package com.clark.pattern.demo.factory.simple;

/**
 * created by LuChang
 * 2019/6/1 15:53
 */
public class SimpleStaticFactoryTest {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.orderPizza("cheesePizza");
    }

}
