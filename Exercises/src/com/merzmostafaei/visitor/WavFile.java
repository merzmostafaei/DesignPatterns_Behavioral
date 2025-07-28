package com.merzmostafaei.visitor;

import com.merzmostafaei.visitor.elementOperation.FactSegment;
import com.merzmostafaei.visitor.elementOperation.FormatSegment;
import com.merzmostafaei.visitor.elementOperation.Segment;

import java.util.ArrayList;
import java.util.List;

public class WavFile {
    private List<Segment> segments = new ArrayList<>();

    // Public getter to access segments if needed
    public List<Segment> getSegments() {
        return segments;
    }

    // Static factory method to simulate reading a wav file and constructing segments
    public static WavFile read(String fileName) {
        var wavFile = new WavFile();

        // Simulate segments in a wav file (e.g. format and fact chunks)
        wavFile.segments.add(new FormatSegment());
        wavFile.segments.add(new FactSegment());
        wavFile.segments.add(new FactSegment());
        wavFile.segments.add(new FactSegment());

        return wavFile;
    }
}
