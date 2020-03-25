package com.kodilla.good.patterns.foodToDoors2.distributors;

import com.kodilla.good.patterns.foodToDoors2.Order;
import com.kodilla.good.patterns.foodToDoors2.OrderDto;

public class GlutenFreeShop implements FoodDistributor{
    private static final String NAME = "Gluten Free Shop";


    @Override
    public OrderDto process(Order order, boolean isOrdered) {
        if(isOrdered) {
            System.out.println("Order number: " + order.getOrderNumber() + " is completed");
            return new OrderDto(true, order.getDateOfOrder(), order.getFoodDistributor(),
                    order.getProduct(), order.getQuantity());
        } else {
            System.out.println("Order number: " + order.getOrderNumber() + " is incorrect");
            return new OrderDto(false, order.getDateOfOrder(), order.getFoodDistributor(),
                    order.getProduct(), order.getQuantity());
        }
    }

    @Override
    public String genDistributionName() {
        return NAME;
    }
}
