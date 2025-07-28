package com.merzmostafaei.mediator;

public class TextBox extends UiHanddler {

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        notifyEventHandler();
    }



}
