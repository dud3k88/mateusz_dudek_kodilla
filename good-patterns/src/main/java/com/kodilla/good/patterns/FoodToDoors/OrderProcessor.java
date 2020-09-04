package com.kodilla.good.patterns.FoodToDoors;

public class OrderProcessor {

    public Order realizeOrder (OrderRequest orderRequest) {
        boolean isRealized = orderRequest.getProduct().getSupplier().process(orderRequest);

        return new Order(orderRequest.getClient(), orderRequest.getProduct(), orderRequest.getQuantity(), isRealized);
    }
}
