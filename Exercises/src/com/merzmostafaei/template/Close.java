package com.merzmostafaei.template;

public class Close extends Task {


    public Close(RecordData recordData) {
        super(recordData);
    }

    @Override
    protected void ToExecute() {
        System.out.println("Close Window");
    }
}
