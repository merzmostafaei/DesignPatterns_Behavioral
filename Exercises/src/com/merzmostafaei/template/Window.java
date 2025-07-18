package com.merzmostafaei.template;

public class Window {
    private RecordData recordData;

    private Close close;

    public Window(Close close) {
        this.recordData = recordData;
        this.close = close;
    }


    public void close(){

        close.Execute();
    }

}
