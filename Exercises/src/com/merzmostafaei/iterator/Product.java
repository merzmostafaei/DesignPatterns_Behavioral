package com.merzmostafaei.iterator;

public class Product {
  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  private int id;
  private String name;

  public Product(int id, String name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public String   toString() {
    return "Product{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
  }
}
