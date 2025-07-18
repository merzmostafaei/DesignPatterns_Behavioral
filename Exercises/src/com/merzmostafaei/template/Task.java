package com.merzmostafaei.template;

public abstract class Task {

    private RecordData recordData;

    public Task(RecordData recordData) {
        this.recordData = recordData;
    }




    protected void Execute() {
        if (recordData != null) {
            recordData.SaveRecord();
        } else {
            throw new IllegalStateException("RecordData is not initialized.");
        }
        ToExecute();
    }

    protected abstract void ToExecute();
}
