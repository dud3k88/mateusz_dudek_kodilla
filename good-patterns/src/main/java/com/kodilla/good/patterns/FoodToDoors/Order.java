package com.kodilla.good.patterns.FoodToDoors;

public class Order {

    private Client client;
    private Product product;
    private int quantity;
    private boolean isRealized;

    public Order(Client client, Product product, int quantity, boolean isRealized) {
        this.client = client;
        this.product = product;
        this.quantity = quantity;
        this.isRealized = isRealized;
    }

    public Client getClient() {
        return client;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isRealized() {
        return isRealized;
    }
}
