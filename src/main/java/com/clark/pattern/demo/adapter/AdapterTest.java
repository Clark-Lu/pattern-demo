package com.clark.pattern.demo.adapter;

/**
 * created by LuChang
 * 2019/6/3 16:34
 */
public class AdapterTest {

    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        TurkeyToDuckAdapter turkeyToDuckAdapter = new TurkeyToDuckAdapter(turkey);
        Duck duck = new WildDuck();
        duckTest(turkeyToDuckAdapter);
        duckTest(duck);
    }

    static void duckTest(Duck duck){
        duck.quack();
        duck.fly();
    }

}
