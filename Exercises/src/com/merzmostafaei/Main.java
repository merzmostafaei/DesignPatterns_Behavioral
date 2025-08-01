package com.merzmostafaei;

import com.merzmostafaei.chainOfResponsibility.entity.DataFile;
import com.merzmostafaei.chainOfResponsibility.fileReader.DataReader;
import com.merzmostafaei.chainOfResponsibility.process.DataFileProcessor;
import com.merzmostafaei.chainOfResponsibility.process.SaveData;
import com.merzmostafaei.chainOfResponsibility.process.UnCompress;
import com.merzmostafaei.command.*;
import com.merzmostafaei.iterator.Product;
import com.merzmostafaei.iterator.ProductCollection;
import com.merzmostafaei.iterator.ProductIteratorInterface;
import com.merzmostafaei.mediator.SignupPage;
import com.merzmostafaei.memento.Document;
import com.merzmostafaei.memento.DocumentHistory;
import com.merzmostafaei.observer.StatusBar;
import com.merzmostafaei.observer.Stock;
import com.merzmostafaei.observer.StockListView;
import com.merzmostafaei.state.DirectionService;
import com.merzmostafaei.state.TravelMode;
import com.merzmostafaei.strategy.ChatClient;
import com.merzmostafaei.strategy.DesAlgorithn;
import com.merzmostafaei.template.Close;
import com.merzmostafaei.template.RecordData;
import com.merzmostafaei.template.Window;
import com.merzmostafaei.visitor.WavFile;
import com.merzmostafaei.visitor.editeOperation.AddReverb;
import com.merzmostafaei.visitor.editeOperation.Normalize;
import com.merzmostafaei.visitor.editeOperation.ReduceNoise;
import com.merzmostafaei.visitor.elementOperation.Editor;
import com.merzmostafaei.visitor.elementOperation.Segment;

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

        //StrategyPattern
        System.out.println("StrategyPattern");

        var chatClient = new ChatClient();
        chatClient.send("password",new DesAlgorithn());


        //TemplatePattern

       var window = new Window(new Close(new RecordData("TemplatePattern")));
       window.close();


       //CommandPattern

        VideoEditor editor = new VideoEditor();
        CommandCompose compose = new CommandCompose();

        Command setText = new AddText(editor, "Command Pattern!");
        Command setContrast = new AddContrast(editor, 7);

        compose.executeCommand(setText);
        compose.executeCommand(setContrast);

        // Optional: replay history
        System.out.println("\n--- Replaying History ---");
        compose.replay();

        // ObseverPattern

        System.out.println("\n--- ObseverPattern---");
        var socket = new Stock("$",29);
        var status = new StatusBar(socket);
        var stocklist = new StockListView(socket);
        socket.addObserver(status);
        socket.addObserver(stocklist);
        socket.setPrice(59.9F);


        // MediatorPattern
        System.out.println("\n --MediatorPattern ");

        var signup = new SignupPage();
        signup.simulateUserInteraction();


        // ChainOfResponsibility
        System.out.println("\n --ChainOfResponsibility");

        //DataReader -> unCompress -> SaveData
        var saveData = new SaveData(null);
        var unCompress = new UnCompress(saveData);
        var dataReader = new DataReader(unCompress);
        var App = new DataFileProcessor(dataReader);
        App.handle(new DataFile("pdf.numbers"));
        //App.handle(new DataFile("photo.XSS"));


        // VisitorPattern

            var waveFIle = WavFile.read("song.wave");

            // add the editor for all segment
            var editor1 = new Editor();
            for (Segment segment : waveFIle.getSegments()){
                editor1.add(segment);
            }

            //create Operation
            var normilize = new Normalize();
            var reduceNoise = new ReduceNoise();
            var addVerb = new AddReverb();

            System.out.println("apply NOrmilize");
            editor1.execute(normilize);

            System.out.println("apply ReduceNoise");
            editor1.execute(reduceNoise);

            System.out.println("apply AddReverb");
            editor1.execute(addVerb);




















    }


}
