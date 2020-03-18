package com.kodilla.good.patterns.allegro;

public class ProductOrderService {

    public static void main(String[] args) {

        SampleOrder sampleOrder = new SampleOrder();
        Order order = sampleOrder.retrieve();

        OrderProcesor orderProcesor = new OrderProcesor(new InfoSerwisSend(), new OrderDelivery(), new OrderRepositoryProcess());
        OrderDto orderDto = orderProcesor.process(order);

        if (orderDto.isBought()){
            System.out.println(orderDto.getProduct().getProductName() + " has been ordered by " + orderDto.getUser().getUserName());
        }else {
            System.out.println("The order couldn't be completed");
        }
    }
}
