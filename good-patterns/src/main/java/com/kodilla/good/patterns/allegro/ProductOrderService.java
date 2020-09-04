public class ProductOrderService {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService, final OrderService orderService,
                               final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process (final OrderRequest orderRequest) {
        boolean isOrdered = orderService.crateOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getOrderTime());

        if (isOrdered) {
            informationService.sendInformation(orderRequest.getUser());
            orderRepository.addToRepository(orderRequest.getProduct());

            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
