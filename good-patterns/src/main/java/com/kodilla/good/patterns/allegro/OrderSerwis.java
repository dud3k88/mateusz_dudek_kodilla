package com.kodilla.good.patterns.allegro;

import java.time.LocalDateTime;

public interface OrderSerwis {

    boolean createOrder (User user, Product product, LocalDateTime dateOfOrder);
}
