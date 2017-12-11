package com.kodilla.good.patterns.challenges2;

public interface OrderRepository {
    boolean createSalesOrder(User user, String product, int quantity);
}
