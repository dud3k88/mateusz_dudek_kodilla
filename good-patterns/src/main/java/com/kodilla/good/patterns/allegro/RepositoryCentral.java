package com.kodilla.good.patterns.allegro;

import java.util.ArrayList;
import java.util.List;

public class RepositoryCentral implements OrderRepository {

    private List<Product> productList = new ArrayList<>();


    @Override
    public void addToRepository(Product product) {
        productList.add(product);
    }

    public List<Product> getProductList() {
        return productList;
    }
}
