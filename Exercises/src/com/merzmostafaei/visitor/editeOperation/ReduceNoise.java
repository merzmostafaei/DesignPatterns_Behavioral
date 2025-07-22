package com.merzmostafaei.visitor.editeOperation;

import com.merzmostafaei.visitor.elementOperation.FactSegment;
import com.merzmostafaei.visitor.elementOperation.FormatSegment;

public class ReduceNoise implements Operation{
    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Adding ReduceNoise to FactSegment.");
    }

    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Adding ReduceNoise to FormatSegment.");
    }


}
