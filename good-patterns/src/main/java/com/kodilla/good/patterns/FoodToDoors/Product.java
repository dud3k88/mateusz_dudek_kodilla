package com.kodilla.good.patterns.FoodToDoors;

import java.util.Objects;

public class Product {

    private String productName;
    private double price;
    private SupplierService supplier;

    public Product(String productName, double price, SupplierService supplier) {
        this.productName = productName;
        this.price = price;
        this.supplier = supplier;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public SupplierService getSupplier() {
        return supplier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                Objects.equals(productName, product.productName) &&
                Objects.equals(supplier, product.supplier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, price, supplier);
    }
}
