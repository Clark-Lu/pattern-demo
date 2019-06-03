package com.clark.pattern.demo.template;

/**
 * created by LuChang
 * 2019/6/3 17:19
 */
public abstract class CaffeineBeverage {

    public final void prepare(){
        boilWater();
        brew();
        pourInCup();
        addCondiment();
    }

    private void boilWater(){
        System.out.println("boil water");
    }

    private void pourInCup(){
        System.out.println("pour in cup");
    }

    abstract void brew();

    abstract void addCondiment();

}
