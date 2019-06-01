package com.clark.pattern.demo.observer;

import com.clark.pattern.demo.observer.observer.Observer;
import com.clark.pattern.demo.observer.observer.Raven;
import com.clark.pattern.demo.observer.observer.Wolf;
import com.clark.pattern.demo.observer.subject.Weather;

/**
 * created by LuChang
 * 2019/5/31 17:50
 */
public class ObserverTest {

    public static void main(String[] args) {
        Weather weather = new Weather();
        Observer wolf = new Wolf();
        Observer raven = new Raven();
        weather.registryObserver(wolf);
        weather.registryObserver(raven);
        weather.setWeather("winter is coming");
        weather.removeObserver(raven);
        weather.setWeather("summer is coming");
    }

}
