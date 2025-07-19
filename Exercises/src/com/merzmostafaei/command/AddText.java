package com.merzmostafaei.command;

public class AddText implements UndoableCommand {
    private VideoEditor editor;
    private String newText;
    private String previousText;

    public AddText(VideoEditor editor, String newText) {
        this.editor = editor;
        this.newText = newText;
    }

    @Override
    public void execute() {
        previousText = editor.getText();
        editor.setText(newText);
    }

    @Override
    public void undo() {
        editor.setText(previousText);
    }
}
