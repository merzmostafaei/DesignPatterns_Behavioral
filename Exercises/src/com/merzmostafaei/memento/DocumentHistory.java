package com.merzmostafaei.memento;

import java.util.Stack;

public class DocumentHistory {

    private Stack<DocumentMemento> history = new Stack<>();

    public void save(DocumentMemento momento){
        history.push(momento);
    }
    public DocumentMemento undo(){
        if(!history.isEmpty()){
            return history.pop();
        }
        throw new IllegalStateException("No history to undo.");
    }

}
