package com.clark.pattern.demo.adapter;

/**
 * created by LuChang
 * 2019/6/3 16:34
 */
public class TurkeyToDuckAdapter implements Duck {

    private Turkey turkey;

    public TurkeyToDuckAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
