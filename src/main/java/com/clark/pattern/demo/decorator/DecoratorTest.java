package com.clark.pattern.demo.decorator;

import com.clark.pattern.demo.decorator.decorator.Milk;
import com.clark.pattern.demo.decorator.decorator.Sugar;

/**
 * created by LuChang
 * 2019/6/1 14:16
 */
public class DecoratorTest {

    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        Beverage milk = new Milk(null);
        Beverage sugar = new Sugar(null);
        Beverage coffeeWithMilk = new Milk(coffee);
        Beverage coffeeWithMilkAndSugar = new Sugar(coffeeWithMilk);
        System.out.println(coffee.getDescription());
        System.out.println(coffee.cost());
        System.out.println(milk.getDescription());
        System.out.println(milk.cost());
        System.out.println(sugar.getDescription());
        System.out.println(sugar.cost());
        System.out.println(coffeeWithMilk.getDescription());
        System.out.println(coffeeWithMilk.cost());
        System.out.println(coffeeWithMilkAndSugar.getDescription());
        System.out.println(coffeeWithMilkAndSugar.cost());
    }

}
