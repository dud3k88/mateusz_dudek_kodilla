package com.kodilla.good.patterns.foodToDoors2;

import com.kodilla.good.patterns.foodToDoors2.distributors.ExtraFoodShop;
import com.kodilla.good.patterns.foodToDoors2.distributors.FoodDistributor;
import com.kodilla.good.patterns.foodToDoors2.distributors.GlutenFreeShop;
import com.kodilla.good.patterns.foodToDoors2.distributors.HealthyShop;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrderSample {
    private List<Order> orderList = new ArrayList<>();

    public ArrayList<Order> retrieve() {
        FoodDistributor extraFoodShop = new ExtraFoodShop();
        FoodDistributor glutenFreeShop = new GlutenFreeShop();
        FoodDistributor healthyShop = new HealthyShop();

        Product milk = new Product("Milk");
        Product bread = new Product("Bread");
        Product ham = new Product("Ham");
        Product lemon = new Product("Lemon");
        Product butter = new Product("Butter");
        Product beer = new Product("Beer");

        orderList.add(new Order("001", LocalDate.of(2020, 03, 10), extraFoodShop,
                milk, 10));
        orderList.add(new Order("002", LocalDate.of(2020, 02, 11), extraFoodShop,
                bread, 4));
        orderList.add(new Order("003", LocalDate.of(2020, 02, 14), glutenFreeShop,
                ham, 6));
        orderList.add(new Order("004", LocalDate.of(2020, 02, 13), glutenFreeShop,
                lemon, 30));
        orderList.add(new Order("005", LocalDate.of(2020, 02, 18), healthyShop,
                beer, 30));
        orderList.add(new Order("006", LocalDate.of(2020, 02, 1), healthyShop,
                butter, 4));

        return new ArrayList<>(orderList);
    }
}
