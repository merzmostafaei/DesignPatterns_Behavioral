package com.merzmostafaei.visitor.elementOperation;

import com.merzmostafaei.visitor.editeOperation.Operation;

import java.util.ArrayList;
import java.util.List;

public class Editor {
    private List<Segment> segments = new ArrayList<>();

    public void add(Segment segment){segments.add(segment);}

    public void execute(Operation operation){
        for(var segment : segments ){
            segment.run(operation);
        }
    }
}
