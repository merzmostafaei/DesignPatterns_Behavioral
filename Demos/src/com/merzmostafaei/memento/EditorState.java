package com.merzmostafaei.memento;

public class EditorState {
  private final String content;

  public EditorState(String content) {
    this.content = content;
  }

  public String getContent() {
    return content;
  }
}
