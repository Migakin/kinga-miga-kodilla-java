package com.kodilla.good.patterns.challenges2;

public class ProductOrderService implements OrderService {
    public boolean order (final User user, final String product, final int quantity){
        System.out.println(user.getNickname() + " (" +user.getName() + " " + user.getSurname() + ") ordered: " + product + " " + quantity + "pcs");

         return true;
    }
}
