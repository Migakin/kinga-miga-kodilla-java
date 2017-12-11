package com.kodilla.good.patterns.challenges2;

public class Application {
    public static void main (String[] args){
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

         OrderProcessor orderProcessor = new OrderProcessor(new ProductOrderService(), new MailService(), new ProductOrderRepository());
         orderProcessor.process(orderRequest);





    }
}
