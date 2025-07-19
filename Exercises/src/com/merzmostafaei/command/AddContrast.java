package com.merzmostafaei.command;

public class AddContrast implements UndoableCommand {
    private VideoEditor editor;
    private float newcontrast;
    private float previousContrast;

    public AddContrast(VideoEditor editor,float newcontrast) {
        this.editor = editor;
        this.newcontrast = newcontrast;
    }

    @Override
    public void execute() {
        previousContrast = editor.getContrast();
        editor.setContrast(newcontrast);
    }


    @Override
    public void undo() {
        editor.setContrast(previousContrast);
    }
}
