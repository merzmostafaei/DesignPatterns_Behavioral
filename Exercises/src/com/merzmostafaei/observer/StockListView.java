package com.merzmostafaei.observer;

import java.util.ArrayList;
import java.util.List;

public class StockListView implements ObserverStock {
    private List<Stock> stocks = new ArrayList<>();

    public StockListView(Stock stock) {
        stocks.add(stock);
    }

    public void show() {
        for (var stock : stocks)
            System.out.println(stock);
    }

    @Override
    public void update() {
        for (var stock : stocks)
        System.out.println("SocketListView Update price"+ stock.getPrice());
    }
}
