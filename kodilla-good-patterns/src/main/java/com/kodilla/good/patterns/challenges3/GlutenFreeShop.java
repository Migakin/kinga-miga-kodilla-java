package com.kodilla.good.patterns.challenges3;

public class GlutenFreeShop implements Vendor {

    public boolean process(OrderSpecifics orderSpecifics){
        System.out.println("Your order of: " + orderSpecifics.getProduct() + ", quantity = " +orderSpecifics.getQuantity() + " at Gluten Free Shop is processing...");
        return true;
    }
}

