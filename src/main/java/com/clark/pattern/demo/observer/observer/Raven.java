package com.clark.pattern.demo.observer.observer;

/**
 * created by LuChang
 * 2019/5/31 17:58
 */
public class Raven implements Observer {
    @Override
    public void observe(String weather) {
        System.out.println("渡鸦观察到天气变为" + weather);
    }
}
