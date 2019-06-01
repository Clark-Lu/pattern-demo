package com.clark.pattern.demo.strategy;

import com.clark.pattern.demo.strategy.ability.Ability;

/**
 * created by LuChang
 * 2019/5/31 17:26
 */
public abstract class Animal {

    private Ability ability;

    public void showAbility(){
        ability.ability();
    }

    public abstract void display();

    public void setAbility(Ability ability) {
        this.ability = ability;
    }
}
