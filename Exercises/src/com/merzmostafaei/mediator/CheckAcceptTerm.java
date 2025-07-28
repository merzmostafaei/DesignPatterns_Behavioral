package com.merzmostafaei.mediator;

public class CheckAcceptTerm extends UiHanddler {

    private boolean check;

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
        notifyEventHandler();
    }


}
