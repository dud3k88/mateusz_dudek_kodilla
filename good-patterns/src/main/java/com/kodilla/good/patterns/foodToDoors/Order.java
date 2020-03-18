package com.kodilla.good.patterns.foodToDoors;

import java.time.LocalDate;

public class Order {

    private User user;
    private Product product;
    private int quantity;
    private LocalDate dateOfOrder;

    public Order(User user, Product product,int quantity, LocalDate dateOfOrder) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
        this.dateOfOrder = dateOfOrder;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }

    public int getQuantity() {
        return quantity;
    }
}
