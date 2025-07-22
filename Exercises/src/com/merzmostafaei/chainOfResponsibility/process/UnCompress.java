package com.merzmostafaei.chainOfResponsibility.process;

import com.merzmostafaei.chainOfResponsibility.entity.DataFile;

public class UnCompress extends Handler {

    public UnCompress(Handler next) {
        super(next);
    }

    @Override
    protected boolean doHandler(DataFile dataFile) {
        System.out.println("unCompressed");
        return false;
    }
}
