package com.clark.pattern.demo.strategy;

import com.clark.pattern.demo.strategy.ability.Ability;

/**
 * created by LuChang
 * 2019/5/31 17:38
 */
public class Wolf extends Animal {

    public Wolf(Ability ability) {
        setAbility(ability);
    }

    public Wolf() {
    }

    @Override
    public void display() {
        System.out.println("冰原狼~");
    }
}
