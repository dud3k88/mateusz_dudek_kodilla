package com.kodilla.spring.calculator;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest


public class CalculatorTestSuite {

    @Test
    public void testCalculator() {
        //Given
        double a = 12;
        double b = 4;
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        double expectedAddResult = 16.0;
        double expectedSubResult = 8.0;
        double expectedMulResult = 48.0;
        double expectedDivResult = 3.0;

        //When
        double actualAddResult = calculator.add(a, b);
        double actualSubResult = calculator.sub(a, b);
        double actualMulResult = calculator.mul(a, b);
        double actualDivResult = calculator.div(a, b);

        //Then
        Assert.assertEquals(expectedAddResult, actualAddResult, 0.0);
        Assert.assertEquals(expectedSubResult, actualSubResult, 0.0);
        Assert.assertEquals(expectedMulResult, actualMulResult, 0.0);
        Assert.assertEquals(expectedDivResult, actualDivResult, 0.0);
    }
}
