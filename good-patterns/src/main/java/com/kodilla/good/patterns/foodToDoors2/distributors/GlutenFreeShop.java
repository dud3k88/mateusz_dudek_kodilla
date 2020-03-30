package com.kodilla.good.patterns.foodToDoors2.distributors;

import com.kodilla.good.patterns.foodToDoors2.Product;
import com.kodilla.good.patterns.foodToDoors2.Suppliers;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class GlutenFreeShop implements Suppliers {
    private String supplierName;
    private String supplierId;
    private List<Product> productList;

    public GlutenFreeShop(String supplierName, String supplierId, List<Product> productList) {
        this.supplierName = supplierName;
        this.supplierId = supplierId;
        this.productList = productList;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public boolean process(String name, List<Product> productList) {
        if (name != null && !productList.isEmpty()) {
            System.out.println("Welcome to 'GlutenFreeShop'!\nProcessing Your order...");
            return true;
        } else {
            return false;
        }
    }
}