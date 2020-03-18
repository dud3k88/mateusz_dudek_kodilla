package com.kodilla.good.patterns.allegro;

import java.time.LocalDateTime;

public class OrderDelivery implements OrderSerwis {

    @Override
    public boolean createOrder(User user, Product product, LocalDateTime dateOfOrder) {
        System.out.println("User Name :" + user.getUserName() + "Product: " + product.getProductName() + ", Date of Order " + dateOfOrder);
        return true;
    }
}
