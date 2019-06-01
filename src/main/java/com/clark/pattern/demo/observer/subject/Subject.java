package com.clark.pattern.demo.observer.subject;

import com.clark.pattern.demo.observer.observer.Observer;

/**
 * created by LuChang
 * 2019/5/31 17:51
 */
public interface Subject {

    void registryObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

}
