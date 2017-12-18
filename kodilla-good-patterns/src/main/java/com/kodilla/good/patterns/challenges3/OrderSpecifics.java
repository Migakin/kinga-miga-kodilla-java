package com.kodilla.good.patterns.challenges3;

public class OrderSpecifics {
    private Vendor vendor;
    private String product;
    private int quantity;

    public OrderSpecifics(Vendor vendor, String product, int quantity) {
        this.vendor = vendor;
        this.product = product;
        this.quantity = quantity;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

}
