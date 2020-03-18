package com.kodilla.good.patterns.foodToDoors;

public class Product {

    private String productName;
    private int quantity;

    public Product(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantityAfterSale(int volumeOfPurchase) {
        this.quantity = quantity - volumeOfPurchase;
    }
}
