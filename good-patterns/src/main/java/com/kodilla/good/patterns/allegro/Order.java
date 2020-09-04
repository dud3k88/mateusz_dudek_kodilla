package com.kodilla.good.patterns.allegro;

import java.time.LocalDateTime;

public class Order {

    private User user;
    private Product product;
    private LocalDateTime orderTime;

    public Order(User user, Product product, LocalDateTime orderTime) {
        this.user = user;
        this.product = product;
        this.orderTime = orderTime;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }
}
