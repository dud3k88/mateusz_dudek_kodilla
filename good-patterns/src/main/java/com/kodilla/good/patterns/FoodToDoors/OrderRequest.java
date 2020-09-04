package com.kodilla.good.patterns.FoodToDoors;

import java.time.LocalDateTime;

public class OrderRequest {

    private Client client;
    private Product product;
    private int quantity;
    private LocalDateTime orderTime;

    public OrderRequest(Client client, Product product, int quantity, LocalDateTime orderTime) {
        this.client = client;
        this.product = product;
        this.quantity = quantity;
        this.orderTime = orderTime;
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

    public LocalDateTime getOrderTime() {
        return orderTime;
    }
}
