package com.kodilla.good.patterns.foodToDoors2;

import com.kodilla.good.patterns.foodToDoors2.distributors.ExtraFoodShop;

public class Application {
    public static void main(String[] args) {

        DataRetriever dataRetriever = new DataRetriever();
        ExtraFoodShop extraFoodShop = dataRetriever.retrieveExtraFoodShop();

        OrderServiceProcessor orderServiceProcessor = new OrderServiceProcessor(new OrderServiceImpl() , new InformToConfirm());
        orderServiceProcessor.order(extraFoodShop);


    }
}
