package com.kodilla.good.patterns.FoodToDoors;

public interface SupplierService {

    boolean process (OrderRequest orderRequest);
    boolean checkProductQuantity(Product product, int quantity);
    void sendProcess();
    void informProcess();
    String getSupplierName();
}
