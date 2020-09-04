package com.kodilla.good.patterns.allegro;

public class RunnerTest {

    public static void main(String[] args) {

        SampleOrder sampleOrder = new SampleOrder();
        OrderRequest orderRequest = sampleOrder.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new Inform(), new OrderProcess(), new RepositoryCentral());
        OrderDto orderDto = productOrderService.process(orderRequest);

        if (orderDto.isBought()) {
            System.out.println("Everything is ok");
        } else {
            System.out.println("Something was wrong");
        }

    }
}
