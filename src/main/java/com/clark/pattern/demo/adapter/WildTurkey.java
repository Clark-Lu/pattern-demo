package com.clark.pattern.demo.adapter;

/**
 * created by LuChang
 * 2019/6/3 16:33
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("turkey fly");
    }
}
