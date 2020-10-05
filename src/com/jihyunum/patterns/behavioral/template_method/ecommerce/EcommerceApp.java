package com.jihyunum.patterns.behavioral.template_method.ecommerce;

public abstract class EcommerceApp {
    String userName;

    // template method
    public void shop(String userName, String itemId) {
        System.out.println("Ordering " + itemId + " for " + userName);
        String orderId = orderItem(itemId);
        String trackingId = trackOrder(orderId);
        System.out.println("Your order has been placed!\nYour tracking ID is " + trackingId);
    }

    public abstract String orderItem(String itemId);
    public abstract String trackOrder(String orderId);
}
