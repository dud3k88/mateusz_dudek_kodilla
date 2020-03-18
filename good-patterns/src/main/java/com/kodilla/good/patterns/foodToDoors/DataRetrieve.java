package com.kodilla.good.patterns.foodToDoors;

import java.time.LocalDate;

public class DataRetrieve {

    public void retrieve () {

        ProducerProcess extraFoodShop = new ExtraFoodShop("Extra Food Shop", "ul. Niewiadoma");
        ProducerProcess healthyFood = new HealthyFood("Healthy Food", "ul. Nowowiejska");
        ProducerProcess glutenFreeShop = new GlutenFreeShop("Gluten Free Shop", "ul. Borowska");

        Product milk = new Product("Milk", 20);
        Product butter = new Product("Butter", 10);
        Product ham = new Product("Ham", 10);
        Product beer = new Product("Beer", 4);
        Product bread = new Product("Bread", 5);
        Product tomato = new Product("Tomato", 50);
        Product potato = new Product("Potato", 50);
        Product apple = new Product("Apple", 70);
        Product mango = new Product("Mango", 10);

        ProductsRegister productsExtraFoodShop = new ProductsRegister();
        ProductsRegister productsHealthyFood = new ProductsRegister();
        ProductsRegister productsGlutenFreeShop = new ProductsRegister();

        productsExtraFoodShop.addToProductList(milk);
        productsExtraFoodShop.addToProductList(butter);
        productsExtraFoodShop.addToProductList(ham);
        productsGlutenFreeShop.addToProductList(beer);
        productsGlutenFreeShop.addToProductList(bread);
        productsGlutenFreeShop.addToProductList(tomato);
        productsHealthyFood.addToProductList(potato);
        productsHealthyFood.addToProductList(apple);
        productsHealthyFood.addToProductList(mango);

        ProducerRegister producerRegister = new ProducerRegister();

        producerRegister.addNewProducer(extraFoodShop, productsExtraFoodShop);
        producerRegister.addNewProducer(healthyFood, productsHealthyFood);
        producerRegister.addNewProducer(glutenFreeShop, productsGlutenFreeShop);

        Order order = new Order(new User("Krzysiek", "Nowak", "Kris", "Krzychu50@wp.pl",
                324234), mango, 4, LocalDate.of(2020, 03, 11));

        Processor processor = new Processor(new SendInformationAboutOrder(), producerRegister);
        processor.process(order);
    }

}
