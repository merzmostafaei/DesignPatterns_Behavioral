package com.merzmostafaei.command;

import java.util.ArrayDeque;
import java.util.Deque;

public class CommandCompose {
    private Deque<Command> history = new ArrayDeque<>();

    public void executeCommand(Command command) {
        command.execute();
        history.push(command);
    }

    public void replay() {
        System.out.println("Replaying all commands:");
        for (Command command : history) {
            command.execute();
        }
    }

    public void undo() {
        if (!history.isEmpty()) {
            Command command = history.pop();
            if (command instanceof UndoableCommand undoable) {
                undoable.undo();
            } else {
                System.out.println("This command cannot be undone.");
            }
        } else {
            System.out.println("Nothing to undo.");
        }
    }

}
