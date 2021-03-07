package com.jihyunum.patterns.behavioral.observer.subscriber;

public class EmailNotificationSubscriber implements Subscriber {
    private String email;

    public EmailNotificationSubscriber(String email) {
        this.email = email;
    }

    @Override
    public void notify(String message) {
        System.out.println("Email notification sent to " + email + "\n" + message);
    }
}
