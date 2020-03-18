package com.kodilla.good.patterns.foodToDoors;

public class HealthyFood implements ProducerProcess {

    private String name;
    private String address;

    public HealthyFood(String name, String address) {
        this.name = name;
        this.address = address;
    }


    @Override
    public void process(Product product, int quantity) {
        System.out.println("Products are ready to shipment " + product.getProductName() + "\nAvailable Quantity: " +
                product.getQuantity());
    }


    @Override
    public String toString() {
        return "HealthyFood{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
