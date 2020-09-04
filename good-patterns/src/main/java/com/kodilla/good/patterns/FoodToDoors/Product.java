package com.kodilla.good.patterns.FoodToDoors;

public class Product {

    private String productName;
    private double price;
    private SupplierService supplier;

    public Product(String productName, double price, SupplierService supplier) {
        this.productName = productName;
        this.price = price;
        this.supplier = supplier;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public SupplierService getSupplier() {
        return supplier;
    }
}
