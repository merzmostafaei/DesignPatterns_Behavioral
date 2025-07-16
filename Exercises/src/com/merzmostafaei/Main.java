package com.merzmostafaei;

import com.merzmostafaei.memento.Document;
import com.merzmostafaei.memento.DocumentHistory;

public class Main {

    public static void main(String[] args) {

        // write your code here

        var doc = new Document();
        var history = new DocumentHistory();

        doc.setContent("samclass");
        doc.setFontName("book");
        doc.setFontSize(10);
        history.save(doc.createMomento());
        System.out.println("save1= "+ doc);

        doc.setContent("ziriclass");
        doc.setFontName("laptop");
        doc.setFontSize(12);
        history.save(doc.createMomento());
        System.out.println("save2= "+ doc);

        doc.setContent("waxuhclass");
        doc.setFontName("secmic");
        doc.setFontSize(4);
        history.save(doc.createMomento());
        System.out.println("save3= "+ doc);


        System.out.println("2undo");
        doc.restore(history.undo());
        doc.restore(history.undo());
        System.out.println(doc);



    }


}
