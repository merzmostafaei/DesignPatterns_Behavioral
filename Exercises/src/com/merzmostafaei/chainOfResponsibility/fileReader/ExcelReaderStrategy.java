package com.merzmostafaei.chainOfResponsibility.fileReader;

import com.merzmostafaei.chainOfResponsibility.FileReaderStrategy;

public class ExcelReaderStrategy implements FileReaderStrategy {
    @Override
    public void read(String filename) {
        System.out.println("Reading data from an Excel spreadsheet: " + filename);
    }
}
