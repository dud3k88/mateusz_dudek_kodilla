package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void BigmacBuldierTest() {
        //Given

        Bigmac bigmac = new Bigmac.BigmacBuilder()
                            .bun(Bun.SESAME)
                            .burger(Burger.L)
                            .sauce(Sauce.BBQ)
                            .ingredient(Ingredient.BACON.description)
                            .ingredient(Ingredient.CUCUMBER.description)
                            .ingredient(Ingredient.MUSHROOM.description)
                            .build();
        System.out.println(bigmac);
        //When
        int howManyIngredient = bigmac.getIngredients().size();
        String burgerSize = bigmac.getBurgers().description;
        //Then
        Assert.assertEquals(3, howManyIngredient);
        Assert.assertEquals("Large", burgerSize);
    }
}
