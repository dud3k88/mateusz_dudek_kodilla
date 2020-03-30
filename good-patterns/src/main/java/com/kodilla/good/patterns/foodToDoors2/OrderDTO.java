package com.kodilla.good.patterns.foodToDoors2;

import java.util.List;

public class OrderDTO {
    private String name;
    private List<Product> productList;
    private boolean isOrder;

    public OrderDTO(String name, List<Product> productList, boolean isOrder) {
        this.name = name;
        this.productList = productList;
        this.isOrder = isOrder;
    }

    public String getName() {
        return name;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public boolean isOrder() {
        return isOrder;
    }
}