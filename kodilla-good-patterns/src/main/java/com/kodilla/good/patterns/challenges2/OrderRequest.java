package com.kodilla.good.patterns.challenges2;

public class OrderRequest {
    public User user;
    public String product;
    public int quantity;

    public OrderRequest(User user, String product, int quantity) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "user=" + user +
                ", product='" + product + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
