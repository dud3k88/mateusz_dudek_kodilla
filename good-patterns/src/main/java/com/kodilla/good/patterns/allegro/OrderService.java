package com.kodilla.good.patterns.allegro;

import java.time.LocalDateTime;

public interface OrderService {

    boolean crateOrder(User user, Product product, LocalDateTime timeOfOrder);
}
