package com.merzmostafaei.observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectStock {
    private List<ObserverStock> observers = new ArrayList<>();
    private Stock stock;
    public void addObserver(ObserverStock observer){
        observers.add(observer);
    }
    public void removeObserver(ObserverStock observer){
        observers.remove(observer);
    }
    public void notifyObserver(){
        for(var observer : observers){
            observer.update();
        }
    }

}