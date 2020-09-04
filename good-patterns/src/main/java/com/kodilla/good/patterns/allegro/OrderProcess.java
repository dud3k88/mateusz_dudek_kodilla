package com.kodilla.good.patterns.allegro;

import java.time.LocalDateTime;

public class OrderProcess  implements  OrderService {
    @Override
    public boolean crateOrder(User user, Product product, LocalDateTime timeOfOrder) {

        System.out.println(user.getUserName() + " " + product.getProductName() + " " + timeOfOrder);
        return true;
    }
}
