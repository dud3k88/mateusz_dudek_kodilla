package com.kodilla.good.patterns.foodToDoors2;

public class OrderServiceProcessor {

    private OrderService orderService;
    private InformService informService;

    public OrderServiceProcessor(OrderService orderService, InformService informService) {
        this.orderService = orderService;
        this.informService = informService;
    }



    public OrderDTO order(Suppliers supplier) {
        supplier.getSupplierName();
        supplier.getProductList();
        boolean isOrdered = supplier.process(supplier.getSupplierName(), supplier.getProductList());
        if (isOrdered) {
            informService.inform();
            return new OrderDTO(supplier.getSupplierName(),
                    supplier.getProductList(), true);
        } else {
            return new OrderDTO(supplier.getSupplierName(),
                    supplier.getProductList(), false);
        }
    }
}
