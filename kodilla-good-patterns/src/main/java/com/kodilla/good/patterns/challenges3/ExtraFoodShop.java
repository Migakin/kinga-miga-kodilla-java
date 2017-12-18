package com.kodilla.good.patterns.challenges3;

public class ExtraFoodShop implements Vendor {
    @Override
    public boolean process(OrderSpecifics orderSpecifics) {
        System.out.println("Extra Food Shop is processing your order of: " + orderSpecifics.getProduct() + " " + orderSpecifics.getQuantity());
        return true;
    }
}
