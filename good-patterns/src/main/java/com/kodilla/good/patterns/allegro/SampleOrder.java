package com.kodilla.good.patterns.allegro;
import java.time.LocalDateTime;

public class SampleOrder {

    public OrderRequest retrieve() {
        User user = new User("Jan", "janek@wp.pl");
        Product product = new Product("Apple");

        return new OrderRequest(user, product, LocalDateTime.now());
    }
}
