package com.kodilla.good.patterns.allegro;

public class OrderProcesor {

    private InfoSerwis infoSerwis;
    private OrderSerwis orderSerwis;
    private OrderRepository orderRepository;

    public OrderProcesor(InfoSerwis infoSerwis, OrderSerwis orderSerwis, OrderRepository orderRepository) {
        this.infoSerwis = infoSerwis;
        this.orderSerwis = orderSerwis;
        this.orderRepository = orderRepository;
    }

    public OrderDto process (final Order order){
        boolean isBought = orderSerwis.createOrder(order.getUser(), order.getProduct(), order.getDateOfOrder());

        if (isBought){
            order.getUser().addToOrderList(order);
            infoSerwis.informationUser(order.getUser());
            orderRepository.addOrderRepository(order);
            return new OrderDto(order.getUser(), order.getProduct(), true);
        } else {
            return new OrderDto(order.getUser(), order.getProduct(), false);
        }
    }
}
