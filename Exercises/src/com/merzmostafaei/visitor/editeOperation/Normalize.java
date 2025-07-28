package com.merzmostafaei.visitor.editeOperation;

import com.merzmostafaei.visitor.elementOperation.FactSegment;
import com.merzmostafaei.visitor.elementOperation.FormatSegment;

public class Normalize implements Operation {

    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Adding Normalize to FactSegment.");
    }

    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Adding Normalize to FormatSegment.");
    }
}
