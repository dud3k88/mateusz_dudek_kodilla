package com.kodilla.good.patterns.foodToDoors2;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class FoodToDoors2TestSuite {

    @Test
    public void testRegistrationProducerAndProducts (){
        Producer sklep = new Producer("Sklep", "ulica");
        Product product1 = new Product("Mleko", new BigDecimal(3.0));
        Product product2 = new Product("Szynka", new BigDecimal(10.5));


        ProductsList productsList = new ProductsList();
        productsList.addProducts(product1);
        productsList.addProducts(product2);

        RegisterProducerAndProducts registerProducerAndProducts = new RegisterProducerAndProducts();
        registerProducerAndProducts.addProducerAndProductsList(sklep, productsList);

        Assert.assertEquals(1, registerProducerAndProducts.getProducerProductsList().size());

    }
}
