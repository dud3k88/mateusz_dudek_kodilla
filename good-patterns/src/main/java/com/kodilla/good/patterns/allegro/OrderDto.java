package com.kodilla.good.patterns.allegro;

public class OrderDto {

    private User user;
    private Product product;
    private boolean isBought;

    public OrderDto(User user, Product product, boolean isBought) {
        this.user = user;
        this.product = product;
        this.isBought = isBought;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isBought() {
        return isBought;
    }
}
