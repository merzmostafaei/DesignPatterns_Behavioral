package com.merzmostafaei.mediator;

public class SignUpButton extends UiHanddler {


    private boolean enabled;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
        notifyEventHandler();
    }

    public void click() {
        if (enabled) {
            System.out.println("Signup submitted!");
        } else {
            System.out.println("Button is disabled. Cannot submit.");
        }
    }


}
