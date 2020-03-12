package com.kodilla.good.patterns.allegro;

import java.time.LocalDateTime;

public class OrderDelivry implements OrderSerwis {

    @Override
    public boolean createOrder(User user, Product product, LocalDateTime dateOfOrder) {
        System.out.println("User Name :" + user.getUnserName() + "Product: " + product.getProductName() + ", Date of Order " + dateOfOrder);
        return true;
    }
}
