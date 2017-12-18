package com.kodilla.good.patterns.challenges3;

public class HealthyShop implements Vendor {
    public boolean process(OrderSpecifics orderSpecifics){
        System.out.println("We are currently processing your order: " + orderSpecifics.getProduct() + " " + orderSpecifics.getQuantity());
        return true;
    }
}
