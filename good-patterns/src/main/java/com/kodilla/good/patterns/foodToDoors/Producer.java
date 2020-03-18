package com.kodilla.good.patterns.foodToDoors;

public class Producer {

    private String producerName;
    private int phoneNumber;
    private String emailAddress;

    public Producer(String producerName, int phoneNumber, String emailAddress) {
        this.producerName = producerName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getProducerName() {
        return producerName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
