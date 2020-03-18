package com.kodilla.good.patterns.foodToDoors;

public class SendInformationAboutOrder implements SendInformation {


    @Override
    public void sendInfo(Order order, boolean isSold) {
        if (isSold){
            System.out.println("Thank You " + order.getUser().getUserName() + ", You ordered: " + order.getProduct().getProductName()
            + ", " + order.getProduct().getQuantity());
            System.out.println("Address: " + order.getUser().getEmailAddress());
            System.out.println("We sent a verification code in your phone: " + order.getUser().getPhoneNumber());
            System.out.println("Date of ordered: " + order.getDateOfOrder());
        } else {
            System.out.println(order.getUser().getUserName() + " your order is failed");
        }
    }
}
