package com.clark.pattern.demo.observer.observer;

/**
 * created by LuChang
 * 2019/5/31 17:56
 */
public class Wolf implements Observer {
    @Override
    public void observe(String weather) {
        System.out.println("冰原狼观察到天气变为" + weather);
    }
}
