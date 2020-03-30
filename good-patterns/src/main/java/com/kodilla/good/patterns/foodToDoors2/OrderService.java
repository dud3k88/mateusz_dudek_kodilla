package com.kodilla.good.patterns.foodToDoors2;

import java.util.List;

public interface OrderService {

    boolean process(String name, List<Product> productList);
    void addSupplier(Suppliers supplier);
}
