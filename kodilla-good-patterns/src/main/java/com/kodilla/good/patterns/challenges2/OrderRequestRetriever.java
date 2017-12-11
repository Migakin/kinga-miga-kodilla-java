package com.kodilla.good.patterns.challenges2;

public class OrderRequestRetriever {
   public OrderRequest retrieve(){
       User user = new User ("Martha21", "Martha", "Smith");
       String product = "Christmas decoration";
       int quantity = 5;

       return new OrderRequest (user, product, quantity);
   }
}
