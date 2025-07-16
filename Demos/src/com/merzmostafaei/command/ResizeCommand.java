package com.merzmostafaei.command;

import com.merzmostafaei.command.fx.Command;

public class ResizeCommand implements Command {
  @Override
  public void execute() {
    System.out.println("Resize");
  }
}
