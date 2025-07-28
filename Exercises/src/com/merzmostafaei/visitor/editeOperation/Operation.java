package com.merzmostafaei.visitor.editeOperation;

import com.merzmostafaei.visitor.elementOperation.FactSegment;
import com.merzmostafaei.visitor.elementOperation.FormatSegment;

//visitor
public interface Operation {
    public void apply(FactSegment factSegment);
    public void apply(FormatSegment formatSegment);


}
