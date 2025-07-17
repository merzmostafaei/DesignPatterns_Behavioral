package com.merzmostafaei.iterator;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
  private List<Product> products = new ArrayList<>();

  public void add(Product product) {

    products.add(product);
  }

  public List<Product> getProducts() {
    return products;
  }

  public ProductIteratorInterface createIterator(){
    return new ProductIterator();
  }

  private class ProductIterator implements ProductIteratorInterface {

    private int index = 0;

    @Override
    public boolean isDone() {
      return index >= products.size();
    }

    @Override
    public Product current() {
      return products.get(index);
    }

    @Override
    public void next() {
        index++;
    }
  }

}
