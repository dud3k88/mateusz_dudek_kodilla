package com.kodilla.good.patterns.allegro;

import java.util.ArrayList;
import java.util.List;

public class OrderRepositoryProcess implements OrderRepository {

    public static List<Order> orderList = new ArrayList<>();


    @Override
    public void addOrderRepository(Order order) {
        orderList.add(order);
        System.out.println("order has been added");
    }
}
