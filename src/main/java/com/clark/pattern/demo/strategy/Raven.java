package com.clark.pattern.demo.strategy;

import com.clark.pattern.demo.strategy.ability.Ability;

/**
 * created by LuChang
 * 2019/5/31 17:40
 */
public class Raven extends Animal {

    public Raven(Ability ability) {
        setAbility(ability);
    }

    public Raven() {
    }

    @Override
    public void display() {
        System.out.println("渡鸦~");
    }
}
