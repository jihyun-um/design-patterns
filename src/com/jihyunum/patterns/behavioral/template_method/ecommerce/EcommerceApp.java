package com.jihyunum.patterns.behavioral.template_method.ecommerce;

public abstract class EcommerceApp {
    String userName;
    String password;

    // template method
    public void logIn(String userName, String password) {
        System.out.println("Welcome " + userName + ", you're logged in!");
    }

    public abstract void orderItem(String itemId);
    public abstract void trackOrder(String orderId);
}
