package com.merzmostafaei.command.editor;

public interface UndoableCommand extends Command {
  void unexecute();
}
