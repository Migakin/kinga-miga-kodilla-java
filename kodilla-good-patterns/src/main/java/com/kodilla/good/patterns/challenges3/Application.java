package com.kodilla.good.patterns.challenges3;

public class Application {
    public static void main (String[] args){
        OrderRetriever orderRetriever = new OrderRetriever();
        OrderSpecifics orderSpecifics = orderRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new MailService());
        orderProcessor.process(orderSpecifics);
    }
}
