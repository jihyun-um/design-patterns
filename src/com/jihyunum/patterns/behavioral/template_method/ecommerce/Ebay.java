package com.jihyunum.patterns.behavioral.template_method.ecommerce;

public class Ebay extends EcommerceApp {
    public Ebay(String userName) {
        this.userName = userName;
    }

    @Override
    public String orderItem(String itemId) {
        System.out.println("[Ebay] Ordering item " + itemId);
        return "order-" + itemId;
    }

    @Override
    public String trackOrder(String orderId) {
        System.out.println("[Ebay] Tracking order " + orderId);
        return "tracking-" + orderId;
    }
}
