package com.merzmostafaei.chainOfResponsibility.process;

import com.merzmostafaei.chainOfResponsibility.entity.DataFile;

public class SaveData extends Handler {


    public SaveData(Handler next) {
        super(next);
    }

    @Override
    protected boolean doHandler(DataFile dataFile) {
        System.out.println("saved Data" + dataFile.getFilename());
        return false;
    }
}
