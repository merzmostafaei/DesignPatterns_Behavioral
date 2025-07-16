package com.merzmostafaei.iterator;

public interface Iterator {
  boolean hasNext();
  Product current();
  void next();
}
