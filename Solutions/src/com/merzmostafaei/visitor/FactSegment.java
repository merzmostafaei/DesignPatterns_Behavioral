package com.merzmostafaei.visitor;

public class FactSegment extends Segment {
  @Override
  public void applyFilter(AudioFilter filter) {
    filter.apply(this);
  }
}
