package com.kodilla.good.patterns.foodToDoors;

import java.util.ArrayList;
import java.util.List;

public class ProductsRegister {

    private List<Product> productList = new ArrayList<>();

    public boolean addToProductList (Product product) {
        if (productList.contains(product)){
            System.out.println("Sorry but this product is on the list");
            return false;
        } else {
            productList.add(product);
            return true;
        }
    }

    public List<Product> getProductList() {
        return productList;
    }

    public Product getProduct (Product product){
        return productList.get(productList.indexOf(product));
    }
}
