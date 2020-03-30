package com.kodilla.good.patterns.foodToDoors2;

import com.kodilla.good.patterns.foodToDoors2.distributors.ExtraFoodShop;
import com.kodilla.good.patterns.foodToDoors2.distributors.GlutenFreeShop;
import com.kodilla.good.patterns.foodToDoors2.distributors.HealthyShop;

import java.util.Arrays;

public class DataRetriever {

    public ExtraFoodShop retrieveExtraFoodShop() {
        ExtraFoodShop extraFoodShop = new ExtraFoodShop("ExtraFoodShop", "01", Arrays.asList(
                new Product("Carrot", "047", 10, Product.Type.VEGETABLE),
                new Product("Apple", "035", 16, Product.Type.FRUIT),
                new Product("Broccoli", "036", 16, Product.Type.VEGETABLE)));
        return extraFoodShop;
    }

    public HealthyShop retrieveHealthyShop() {
        HealthyShop healthyShop = new HealthyShop("HealthyShop", "02", Arrays.asList(
                new Product("Lettuce", "012", 17, Product.Type.VEGETABLE),
                new Product("Chicken", "009", 14, Product.Type.MEAT),
                new Product("Corn", "026", 11, Product.Type.GRAIN)));
        return healthyShop;
    }

    public GlutenFreeShop retrieveGlutenFreeShop() {
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop("GlutenFreeShop", "03", Arrays.asList(
                new Product("Rice", "013", 15, Product.Type.GRAIN ),
                new Product("Beef", "014", 9, Product.Type.MEAT),
                new Product("Soybeans", "005", 11, Product.Type.GRAIN)));
        return glutenFreeShop;
    }
}