package com.kodilla.good.patterns.FoodToDoors;

import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShopSupplier implements SupplierService {

    private Map<Product, Integer> productList = new HashMap<>();

    private String supplierName, supplierEmail;
    private int supplierPhoneNumber;

    public GlutenFreeShopSupplier (String supplierName, String supplierEmail, int supplierPhoneNumber) {
        this.supplierName = supplierName;
        this.supplierEmail = supplierEmail;
        this.supplierPhoneNumber = supplierPhoneNumber;
    }

    public Map<Product, Integer> getProductList() {
        return productList;
    }

    @Override
    public String getSupplierName() {
        return supplierName;
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }

    public int getSupplierPhoneNumber() {
        return supplierPhoneNumber;
    }

    @Override
    public boolean process(OrderRequest orderRequest) {
        if (checkProductQuantity(orderRequest.getProduct(), orderRequest.getQuantity())) {
            System.out.println("the order was successfully completed" + orderRequest.getProduct() + " " +
                    orderRequest.getQuantity() + " pieces " + orderRequest.getOrderTime());
            sendProcess();
            informProcess();

            return true;
        } else {
            System.out.println("the order has not been processed");

            return false;
        }

    }

    @Override
    public boolean checkProductQuantity(Product product, int quantity) {
        boolean supply = false;

        for (Map.Entry<Product, Integer> entry : productList.entrySet()) {
            if (entry.getKey() == product) {
                if (quantity <= entry.getValue()) {
                    supply = true;
                }
            }
        }

        return supply;
    }

    @Override
    public void sendProcess() {
        System.out.println("the order has been transferred to the supplier");
    }

    @Override
    public void informProcess() {
        System.out.println("the order has been shipped to the customer");
    }
}

