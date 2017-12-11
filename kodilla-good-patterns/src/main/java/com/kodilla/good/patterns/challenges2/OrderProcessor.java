package com.kodilla.good.patterns.challenges2;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final OrderService orderService, final InformationService informationService, final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }
    public OrderDto process(final OrderRequest orderRequest){
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getQuantity());
        if(isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createSalesOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getQuantity());
            return new OrderDto(orderRequest.getUser(), true);
        }else {
            return new OrderDto(orderRequest.getUser(), false);

        }
    }
}
