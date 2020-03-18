package com.kodilla.good.patterns.foodToDoors;

import java.util.HashMap;
import java.util.Map;

public class ProducerRegister {

    private Map<ProducerProcess, ProductsRegister> registerProducers = new HashMap<>();


    public void addNewProducer(ProducerProcess producerProcess, ProductsRegister productsRegister) {
        registerProducers.put(producerProcess, productsRegister);
    }

    public void showAllAvailableProducts() {
        for (Map.Entry<ProducerProcess, ProductsRegister> current : registerProducers.entrySet()) {
            for (Product currentProduct : current.getValue().getProductList()) {
                if (currentProduct.getQuantity() > 0)
                    System.out.println(currentProduct.toString());
            }
        }
    }

    public boolean isAvailableProduct(Product product, int volumeOfPurchase) {
        for (Map.Entry<ProducerProcess, ProductsRegister> current : registerProducers.entrySet()) {
            for (Product currentProduct : current.getValue().getProductList()) {
                if (currentProduct.equals(product) && currentProduct.getQuantity() > volumeOfPurchase) {
                    product.setQuantityAfterSale(volumeOfPurchase);
                    return true;
                }
            }
        }
        return false;
    }
}
