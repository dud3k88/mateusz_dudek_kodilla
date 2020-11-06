package com.kodilla.patterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {
    @Test
    public void basicPizzaOrderTestSuite() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatePizzaOrder = pizzaOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(20), calculatePizzaOrder);
    }

    @Test
    public void pizzaOrderWithDoubleCheeseCostTestSuite() {
        //Given
        PizzaOrder theOrder =  new BasicPizzaOrder();
        theOrder = new DoubleCheese(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(25), theCost);

    }

    @Test
    public void pizzaOrderWithDoubleCheeseDescriptionTestSuite() {
        //Given
        PizzaOrder theOrder =  new BasicPizzaOrder();
        theOrder = new DoubleCheese(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        Assert.assertEquals("cake, tomato sauce, cheese, double cheese", description);

    }

    @Test
    public void pizzaOrderWithDoubleCheeseAndMushroomsTestSuite() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DoubleCheese(theOrder);
        theOrder = new ExtraMushroom(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        String description = theOrder.getDescription();
        //Then
        Assert.assertEquals(new BigDecimal(32), theCost);
        Assert.assertEquals("cake, tomato sauce, cheese, double cheese, extra mushroom", description);
    }
}
