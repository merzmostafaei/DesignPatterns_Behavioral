package com.merzmostafaei.chainOfResponsibility.process;

import com.merzmostafaei.chainOfResponsibility.entity.DataFile;

public abstract class Handler {

    private Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    // implimatation of our tamplate to not be null in datareader

    public void handle(DataFile dataReader){
        if(doHandler(dataReader))
            return;

        if(next != null)
            next.handle(dataReader);

    }

   protected abstract boolean doHandler(DataFile dataFile);


}
