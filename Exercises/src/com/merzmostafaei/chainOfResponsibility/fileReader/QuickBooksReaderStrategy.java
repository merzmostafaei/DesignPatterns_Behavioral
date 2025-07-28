package com.merzmostafaei.chainOfResponsibility.fileReader;

import com.merzmostafaei.chainOfResponsibility.FileReaderStrategy;

public class QuickBooksReaderStrategy implements FileReaderStrategy {
    @Override
    public void read(String filename) {
        System.out.println("Reading data from a QuickBooks file: " + filename);
    }
}
