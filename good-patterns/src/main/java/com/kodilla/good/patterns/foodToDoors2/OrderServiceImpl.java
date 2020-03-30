package com.kodilla.good.patterns.foodToDoors2;

import java.util.ArrayList;
import java.util.List;

public class OrderServiceImpl implements OrderService {
    private List<Suppliers> supplierList = new ArrayList<>();

    @Override
    public boolean process(String name, List<Product> productList) {
        for (Suppliers supplier : supplierList) {
            if (supplier.getSupplierName().equals(name)) {
                return supplier.process(supplier.getSupplierName(), supplier.getProductList());
            }
        }
        return false;
    }

    public List<Suppliers> getSupplierList() {
        return supplierList;
    }

    public void addSupplier(Suppliers supplier) {
        supplierList.add(supplier);
    }

    public void removeSupplier(Suppliers supplier) {
        supplierList.remove(supplier);
    }
}