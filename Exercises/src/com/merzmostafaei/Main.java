package com.merzmostafaei;

import com.merzmostafaei.iterator.Product;
import com.merzmostafaei.iterator.ProductCollection;
import com.merzmostafaei.iterator.ProductIteratorInterface;
import com.merzmostafaei.memento.Document;
import com.merzmostafaei.memento.DocumentHistory;
import com.merzmostafaei.state.DirectionService;
import com.merzmostafaei.state.TravelMode;

public class Main {

    public static void main(String[] args) {

        //Momento
        System.out.println("//Momento");

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
        //-----------------------------------------

        // StatePattern
        System.out.println("// StatePattern");
//        //with IF/else
//        var direction = new DirectionService();
//        direction.setTravelMode(TravelMode.WALKING);
//        direction.getEta();
//        direction.getDirection();
//        System.out.println(direction.getTravelMode());

        var service = new DirectionService();

        service.setTravelMode(TravelMode.WALKING);
        service.getTravelInfo();

        service.setTravelMode(TravelMode.BICYCLING);
        service.getTravelInfo();


    // IteratorPattern
        System.out.println("// IteratorPattern");

        var productCollection = new ProductCollection();
        productCollection.add(new Product(1,"bottle"));
        productCollection.add(new Product(2,"Tv"));
        productCollection.add(new Product(3,"pen"));
        productCollection.createIterator();

        //Create iterator
        ProductIteratorInterface iterator = productCollection.createIterator();

        //Iterate Through the Collecttion

        while (!iterator.isDone()){
            Product product = iterator.current();
            System.out.println("Product ID: " + product.getId() + ", Name: " + product.getName());
            iterator.next();
        }





    }


}
