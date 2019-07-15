package com.tws.refactoring.extract_variable;

import org.junit.Assert;
import org.junit.Test;

public class PriceCalculatorTest {
    @Test
    public void should_return__when_give_10_and_50(){
        PriceCalculator priceCalculator = new PriceCalculator();
        double price = priceCalculator.getPrice(10,50);
        Assert.assertEquals(550,price,0);
    }

    @Test
    public void should_return__when_give_500_and_50(){
        PriceCalculator priceCalculator = new PriceCalculator();
        double price = priceCalculator.getPrice(500,50);
        Assert.assertEquals(25100.0,price,0);
    }
    @Test
    public void should_return__when_give_501_and_50(){
        PriceCalculator priceCalculator = new PriceCalculator();
        double price = priceCalculator.getPrice(501,50);
        Assert.assertEquals(25147.5,price,0);
    }

    @Test
    public void should_return__when_give_100_and_10(){
        PriceCalculator priceCalculator = new PriceCalculator();
        double price = priceCalculator.getPrice(100,10);
        Assert.assertEquals(1100.0,price,0);
    }

    @Test
    public void should_return__when_give_101_and_10(){
        PriceCalculator priceCalculator = new PriceCalculator();
        double price = priceCalculator.getPrice(101,10);
        Assert.assertEquals(1110.0,price,0);
    }
}
