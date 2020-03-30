package com.kodilla.good.patterns.foodToDoors2;

import java.util.List;

public interface Suppliers {

    String getSupplierName();
    List<Product> getProductList();
    boolean process(String name, List<Product> productList);
}

