package com.merzmostafaei.chainOfResponsibility.process;

import com.merzmostafaei.chainOfResponsibility.entity.DataFile;

public class DataFileProcessor {
    private Handler handler;

    public DataFileProcessor(Handler handler) {
        this.handler = handler;
    }

    public void handle(DataFile dataFile) {
        if (handler != null) {
            handler.handle(dataFile);
        } else {
            System.out.println("Handler chain is not initialized.");
        }
    }


}
