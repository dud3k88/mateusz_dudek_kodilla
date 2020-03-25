package com.kodilla.good.patterns.foodToDoors2;

import com.kodilla.good.patterns.foodToDoors2.distributors.FoodDistributor;

import java.time.LocalDate;

public class OrderDto {
    private boolean isOrdered;
    private LocalDate dateOfOrder;
    private FoodDistributor foodDistributor;
    private Product product;
    private int quantity;

    public OrderDto(boolean isOrdered, LocalDate dateOfOrder, FoodDistributor foodDistributor, Product product, int quantity) {
        this.isOrdered = isOrdered;
        this.dateOfOrder = dateOfOrder;
        this.foodDistributor = foodDistributor;
        this.product = product;
        this.quantity = quantity;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }

    public FoodDistributor getFoodDistributor() {
        return foodDistributor;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
