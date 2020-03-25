package com.kodilla.good.patterns.foodToDoors2;

import com.kodilla.good.patterns.foodToDoors2.distributors.FoodDistributor;

import java.time.LocalDate;
import java.util.Objects;

public class Order {
    private String orderNumber;
    private LocalDate dateOfOrder;
    private FoodDistributor foodDistributor;
    private Product product;
    private int quantity;

    public Order(final String orderNumber,final LocalDate dateOfOrder, final FoodDistributor foodDistributor,
                 final Product product,final int quantity) {
        this.orderNumber = orderNumber;
        this.dateOfOrder = dateOfOrder;
        this.foodDistributor = foodDistributor;
        this.product = product;
        this.quantity = quantity;
    }

    public String getOrderNumber() {
        return orderNumber;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return quantity == order.quantity &&
                Objects.equals(orderNumber, order.orderNumber) &&
                Objects.equals(dateOfOrder, order.dateOfOrder) &&
                Objects.equals(foodDistributor, order.foodDistributor) &&
                Objects.equals(product, order.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderNumber, dateOfOrder, foodDistributor, product, quantity);
    }
}


