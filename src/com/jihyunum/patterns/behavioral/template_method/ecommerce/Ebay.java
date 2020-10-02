package com.jihyunum.patterns.behavioral.template_method.ecommerce;

public class Ebay extends EcommerceApp {
    public Ebay(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public void orderItem(String itemId) {
        System.out.println("[Ebay] Ordering item " + itemId);
    }

    @Override
    public void trackOrder(String orderId) {
        System.out.println("[Ebay] Tracking order " + orderId);
    }
}
