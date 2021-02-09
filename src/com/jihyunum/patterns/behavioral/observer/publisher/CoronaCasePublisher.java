package com.jihyunum.patterns.behavioral.observer.publisher;

import com.jihyunum.patterns.behavioral.observer.subscriber.Subscriber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// subscriber 관리
// 상태 변화 시 subscribers에게 update
public class CoronaCasePublisher {
    Map<String, List<Subscriber>> subscriptions = new HashMap<>();

    public CoronaCasePublisher(String[] countries) {
        for (String country : countries) {
            this.subscriptions.put(country, new ArrayList<>());
        }
    }

    public void subscribe(String country, Subscriber subscriber) {
        List<Subscriber> subscribers = this.subscriptions.get(country);
        subscribers.add(subscriber);
    }

    public void unsubscribe(String country, Subscriber subscriber) {
        List<Subscriber> subscribers = this.subscriptions.get(country);
        subscribers.remove(subscriber);
    }

    public void notify(String country, int numberOfCases) {
        List<Subscriber> subscribers = this.subscriptions.get(country);
        for (Subscriber subscriber : subscribers) {
            String message = country + " has " + numberOfCases + " cases today.";
            subscriber.notify(message);
        }
    }
}
