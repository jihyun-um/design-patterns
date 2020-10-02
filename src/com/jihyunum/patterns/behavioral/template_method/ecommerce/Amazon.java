package com.jihyunum.patterns.behavioral.template_method.ecommerce;

public class Amazon extends EcommerceApp {
    public Amazon(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public void orderItem(String itemId) {
        System.out.println("[Amazon] Ordering item " + itemId);
    }

    @Override
    public void trackOrder(String orderId) {
        System.out.println("[Amazon] Tracking order " + orderId);
    }
}
