package com.kodilla.patterns2.decorator.taxiportal;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class TaxiOrderTestSuite {

    @Test
    public void testBasicTaxiOrderGetCost() {
        TaxiOrder theOrder = new BasicTaxiOrder();

        BigDecimal calculateCost = theOrder.getCost();

        Assert.assertEquals(new BigDecimal(5), calculateCost);
    }

    @Test
    public void testBasicTaxiOrderGetDescription() {
        TaxiOrder theOrder = new BasicTaxiOrder();

        String description = theOrder.getDescription();

        Assert.assertEquals("Drive a course ", description);
    }

    @Test
    public void testTaxiNetworkGetCost() {
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);

        BigDecimal theCost = theOrder.getCost();

        Assert.assertEquals(new BigDecimal(40), theCost);
    }

    @Test
    public void testTaxiNetworkGetDescription() {
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);

        String description = theOrder.getDescription();

        Assert.assertEquals("Drive a course by Taxi Network", description);
    }
}
