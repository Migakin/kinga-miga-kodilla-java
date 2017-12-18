package com.kodilla.good.patterns.challenges3;

public class OrderRetriever {
    public OrderSpecifics retrieve(){
        Vendor vendor = new HealthyShop();
        String product = "carrots";
        int quantity = 20;

        return new OrderSpecifics(vendor,product,quantity);

    }
}
