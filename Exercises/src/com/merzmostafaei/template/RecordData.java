package com.merzmostafaei.template;

public class RecordData {
    private String Data ;

    public RecordData(String data) {
        this.Data= data;
    }
    public RecordData() {
        this.Data= "Defult";
    }

    public void SaveRecord(){
        System.out.println("your Data Saved");
    }

}
