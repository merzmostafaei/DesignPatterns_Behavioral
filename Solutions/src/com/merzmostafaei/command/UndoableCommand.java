package com.merzmostafaei.command;

public interface UndoableCommand extends Command {
    void undo();
}
