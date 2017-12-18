package com.kodilla.good.patterns.challenges3;

public class OrderProcessor {
    private ConfirmationService confirmationService;

    public OrderProcessor(ConfirmationService confirmationService) {
        this.confirmationService = confirmationService;
    }

    public void process(OrderSpecifics orderSpecifics){
        boolean isOrdered =  orderSpecifics.getVendor().process(orderSpecifics);
        if (isOrdered){
            confirmationService.inform();
        }
        else{
            System.out.println("There was a problem with the order");
        }
    }
}
