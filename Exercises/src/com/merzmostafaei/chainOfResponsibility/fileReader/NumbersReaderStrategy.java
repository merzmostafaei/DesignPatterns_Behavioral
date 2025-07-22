package com.merzmostafaei.chainOfResponsibility.fileReader;

import com.merzmostafaei.chainOfResponsibility.FileReaderStrategy;

public class NumbersReaderStrategy implements FileReaderStrategy {
    @Override
    public void read(String filename) {
        System.out.println("Reading data from a Numbers spreadsheet: " + filename);
    }
}