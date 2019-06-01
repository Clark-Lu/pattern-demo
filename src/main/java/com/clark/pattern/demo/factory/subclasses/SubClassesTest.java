package com.clark.pattern.demo.factory.subclasses;

/**
 * created by LuChang
 * 2019/6/1 16:14
 */
public class SubClassesTest {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new NewYorkPizzaStore();
        pizzaStore.orderPizza("cheesePizza");
        pizzaStore = new ChicagoPizzaStore();
        pizzaStore.orderPizza("cheesePizza");
    }

}
