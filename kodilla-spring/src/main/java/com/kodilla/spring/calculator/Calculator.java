package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public final class Calculator {

    @Autowired
    private Display display;

    public double add(double a, double b) {

        double result = a + b;
        this.display.displayValue(result);
        return result;
    }

    public double sub(double a, double b) {

        double result = a - b;
        this.display.displayValue(result);
        return result;
    }

    public double mul(double a, double b) {

        double result = a * b;
        this.display.displayValue(result);
        return result;
    }

    public double div(double a, double b) {

        double result = 0.0; 
        if (a==0) {
            System.out.println("You can not divide by 0");
        } else {
            result = a / b;
        }
           return result;  
    }
}
