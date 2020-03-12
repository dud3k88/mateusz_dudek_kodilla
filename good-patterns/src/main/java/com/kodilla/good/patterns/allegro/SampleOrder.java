package com.kodilla.good.patterns.allegro;

import java.time.LocalDateTime;

public class SampleOrder {

        public Order retrieve() {

            User sampleUser = new User("Misiek");
            Product sampleProduct = new Product("Kapcie");
            LocalDateTime sampleOrderTime = LocalDateTime.of(2017, 10, 1, 12, 8, 23);

            return new Order(sampleUser, sampleProduct, sampleOrderTime);
        }
    }

