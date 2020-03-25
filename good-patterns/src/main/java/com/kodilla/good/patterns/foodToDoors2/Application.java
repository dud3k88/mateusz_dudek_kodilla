package com.kodilla.good.patterns.foodToDoors2;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        OrderSample orderList = new OrderSample();
        ArrayList<Order> orders = orderList.retrieve();

        for (Order order : orders){
            OrderDto orderDto = order.getFoodDistributor().process(order, true);
            if (orderDto.isOrdered()) {
                System.out.println("Order details: "
                        + "\nDate of order: " + orderDto.getDateOfOrder()
                        + "\nProduct :" + orderDto.getProduct().getProductName()
                        + "\nQuantity: " + orderDto.getQuantity()
                        + "\nDistributor: " + orderDto.getFoodDistributor().genDistributionName());
            }
        }
    }
}
