package com.kodilla.good.patterns.foodToDoors;

public class Processor {

    private SendInformation sendInformation;
    private ProducerRegister producerRegister;

    public Processor(SendInformation sendInformation, ProducerRegister producerRegister) {
        this.sendInformation = sendInformation;
        this.producerRegister = producerRegister;
    }

    public void process (Order order) {
        boolean isAvailable = producerRegister.isAvailableProduct(order.getProduct(), order.getQuantity());
        sendInformation.sendInfo(order, isAvailable);
        if (!isAvailable){
            System.out.println("Your order can not be processed");
        }
    }
}
