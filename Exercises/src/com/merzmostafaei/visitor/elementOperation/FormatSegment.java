package com.merzmostafaei.visitor.elementOperation;

import com.merzmostafaei.visitor.editeOperation.Operation;

public class FormatSegment implements Segment {
    @Override
    public void run(Operation operation) {
        operation.apply(this);
    }
}
