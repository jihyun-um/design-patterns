package com.jihyunum.patterns.behavioral.observer.subscriber;

public class SmsNotificationSubscriber implements Subscriber {
    private String phoneNumber;

    public SmsNotificationSubscriber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void notify(String message) {
        System.out.println("SMS notification sent to " + phoneNumber + "\n" + message);
    }
}
