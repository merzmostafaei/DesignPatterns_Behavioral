package com.merzmostafaei.visitor.editeOperation;

import com.merzmostafaei.visitor.elementOperation.FactSegment;
import com.merzmostafaei.visitor.elementOperation.FormatSegment;

public class AddReverb implements Operation {
    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Adding reverb to FactSegment.");
    }

    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Adding reverb to FormatSegment.");
    }


}
