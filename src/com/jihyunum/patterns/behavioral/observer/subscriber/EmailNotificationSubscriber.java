package com.jihyunum.patterns.behavioral.observer.subscriber;

import com.jihyunum.patterns.behavioral.observer.publisher.CoronaCasePublisher;

public class EmailNotificationSubscriber implements Subscriber {
    private CoronaCasePublisher coronaCasePublisher;
    private String email;

    public EmailNotificationSubscriber(String email) {
        this.email = email;
    }

    @Override
    public void notify(String message) {
        System.out.println("Email notification sent to " + email + "\n" + message);
    }
}
