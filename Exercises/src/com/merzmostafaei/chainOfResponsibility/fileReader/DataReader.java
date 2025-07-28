package com.merzmostafaei.chainOfResponsibility.fileReader;

import com.merzmostafaei.chainOfResponsibility.FileReaderStrategy;
import com.merzmostafaei.chainOfResponsibility.entity.DataFile;
import com.merzmostafaei.chainOfResponsibility.process.Handler;


import java.util.HashMap;
import java.util.Map;

public class DataReader extends Handler {

    private final Map<String, FileReaderStrategy> stategies = new HashMap<>();

    public DataReader(Handler next) {
        super(next);
        stategies.put(".xls",new ExcelReaderStrategy());
        stategies.put(".numbers",new NumbersReaderStrategy());
        stategies.put(".qbw",new QuickBooksReaderStrategy());
    }

    @Override
    protected boolean doHandler(DataFile dataFile) {
            String filename = dataFile.getFilename().toLowerCase();

            for(Map.Entry<String,FileReaderStrategy> entry : stategies.entrySet()){
                if (filename.endsWith(entry.getKey())){
                    entry.getValue().read(filename);
                    return false;
                }
            }


        throw new UnsupportedOperationException("Unsupported file type: " + filename);
    }
}
