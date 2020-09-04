package com.kodilla.good.patterns.FoodToDoors;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DataRetrieve {

    ExtraFoodSupplier extraFoodSupplier = new ExtraFoodSupplier("Extra Food Shop",
            "efs@supplier.com", 28384755);
    GlutenFreeShopSupplier glutenFreeShopSupplier = new GlutenFreeShopSupplier("Gluten Free Shop",
            "gfs@supplier.com", 2323131);
    HealthyShopSupplier healthyShopSupplier = new HealthyShopSupplier("Healthy Shop",
            "hs@supplier.com", 2342345);

    Product extraFoodProduct = new Product("Bread", 10, extraFoodSupplier);
    Product glutenFreeProduct = new Product("Ham", 40, glutenFreeShopSupplier);
    Product healthyShopProduct = new Product("Orange Juice", 15, healthyShopSupplier);

    List<Product> allProductList = new ArrayList<>();
    List<SupplierService> supplierList = new ArrayList<>();

    public void generateData() {
        allProductList.add(extraFoodProduct);
        allProductList.add(glutenFreeProduct);
        allProductList.add(healthyShopProduct);

        supplierList.add(extraFoodSupplier);
        supplierList.add(glutenFreeShopSupplier);
        supplierList.add(healthyShopSupplier);

        extraFoodSupplier.getProductList().put(extraFoodProduct, 5);
    }

    public OrderRequest getSimpleOrder() {
        Client client = new Client("Jan", "Janek12", "janek12@wp.pl");

        return new OrderRequest(client, extraFoodProduct, 3, LocalDateTime.now());
    }

    public List<Product> getAllProductList() {
        return allProductList;
    }

    public List<SupplierService> getSupplierList() {
        return supplierList;
    }
}
