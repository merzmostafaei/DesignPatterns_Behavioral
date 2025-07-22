package com.merzmostafaei.mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class UiHanddler {
    private List<EventHandler> eventHandlers = new ArrayList<>();

    protected void addEventHandler(EventHandler eventHandler){
        eventHandlers.add(eventHandler);
    }

    protected void notifyEventHandler(){
        for (var eventhandler : eventHandlers){
            eventhandler.handler();

        }
    }









}
