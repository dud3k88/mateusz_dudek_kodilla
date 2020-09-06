package com.kodilla.good.patterns.FoodToDoors;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        DataRetrieve dataRetrieve = new DataRetrieve();
        dataRetrieve.generateData();

        OrderRequest orderRequest = dataRetrieve.getSimpleOrder();

        OrderProcessor orderProcessor = new OrderProcessor();

        boolean isRealized = orderProcessor.realizeOrder(orderRequest).isRealized();

        if (isRealized) {
            System.out.println("Dear customer, we have received information from the supplier " +
                    orderRequest.getProduct().getSupplier().getSupplierName() + " about the correct execution of the order");
        } else {
            System.out.println("the order has failed");
        }
    }
}
