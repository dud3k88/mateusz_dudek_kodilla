package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void BigmacBuldierTest() {
        //Given

        Bigmac bigmac = new Bigmac.BigmacBuilder("with sesame", 3)
                            .sauce("1000 islands")
                            .ingredient("cucumber")
                            .build();
        System.out.println(bigmac);
        //When
        int howManyIngredient = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(1, howManyIngredient);
    }
}
