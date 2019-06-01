package com.clark.pattern.demo.strategy;

import com.clark.pattern.demo.strategy.ability.Ability;
import com.clark.pattern.demo.strategy.ability.FlyAbility;
import com.clark.pattern.demo.strategy.ability.RunAbility;

/**
 * created by LuChang
 * 2019/5/31 17:44
 */
public class StrategyTest {
    public static void main(String[] args) {
        Ability run = new RunAbility();
        Ability fly = new FlyAbility();

        Animal animal = new Wolf(run);
        animal.display();
        animal.showAbility();

        animal = new Raven(fly);
        animal.display();
        animal.showAbility();
        animal.setAbility(run);
        animal.showAbility();
    }
}
