package com.jihyunum.patterns.behavioral.template_method.ecommerce;

public class Amazon extends EcommerceApp {
    public Amazon(String userName) {
        this.userName = userName;
    }

    @Override
    public String orderItem(String itemId) {
        System.out.println("[Amazon] Ordering item " + itemId);
        return "order-" + itemId;
    }

    @Override
    public String trackOrder(String orderId) {
        System.out.println("[Amazon] Tracking order " + orderId);
        return "tracking-" + orderId;
    }
}
