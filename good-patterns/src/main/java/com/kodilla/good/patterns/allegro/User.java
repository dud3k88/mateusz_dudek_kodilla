package com.kodilla.good.patterns.allegro;

import java.util.ArrayList;
import java.util.List;

public class User {

    private final String userName;
    private List<Order> orderList = new ArrayList<>();


    public User(String userName) {
        this.userName = userName;
    }

    public String getUnserName() {
        return userName;
    }

    public void addToOrderList (Order order){
        orderList.add(order);
    }
}
