package com.kodilla.good.patterns.foodToDoors2.distributors;

import com.kodilla.good.patterns.foodToDoors2.Order;
import com.kodilla.good.patterns.foodToDoors2.OrderDto;

public interface FoodDistributor {

    OrderDto process (Order order, boolean isOrdered);
    String genDistributionName();
}
