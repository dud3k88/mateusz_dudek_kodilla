package com.kodilla.good.patterns.foodToDoors2;

public class Product {

    private String name;
    private String productId;
    private int quantity;
    private Type type;

    public enum Type {
        FRUIT, VEGETABLE, MEAT, GRAIN,
    }

    public Product(String name, String productId, int quantity, Type type) {
        this.name = name;
        this.productId = productId;
        this.quantity = quantity;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public Type getType() {
        return type;
    }

}