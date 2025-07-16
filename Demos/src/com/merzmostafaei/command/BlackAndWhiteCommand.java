package com.merzmostafaei.command;

import com.merzmostafaei.command.fx.Command;

public class BlackAndWhiteCommand implements Command {
  @Override
  public void execute() {
    System.out.println("Black and white");
  }
}
