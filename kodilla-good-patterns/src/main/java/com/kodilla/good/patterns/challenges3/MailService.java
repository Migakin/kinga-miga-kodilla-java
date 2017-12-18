package com.kodilla.good.patterns.challenges3;

public class MailService implements ConfirmationService{
    @Override
    public void inform() {
        System.out.println("Your order has been completed");
    }
}
