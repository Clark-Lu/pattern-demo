package com.clark.pattern.demo.observer.subject;

import com.clark.pattern.demo.observer.observer.Observer;

import java.util.HashSet;
import java.util.Set;

/**
 * created by LuChang
 * 2019/5/31 17:53
 */
public class Weather implements Subject {

    private Set<Observer> observers = new HashSet<>(2);

    private String weather;

    @Override
    public void registryObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.observe(weather));
    }

    public void setWeather(String weather) {
        this.weather = weather;
        this.notifyObservers();
    }

    public String getWeather() {
        return weather;
    }
}
