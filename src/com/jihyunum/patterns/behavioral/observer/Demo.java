package com.jihyunum.patterns.behavioral.observer;

import com.jihyunum.patterns.behavioral.observer.publisher.CovidCasePublisher;
import com.jihyunum.patterns.behavioral.observer.subscriber.EmailNotificationSubscriber;
import com.jihyunum.patterns.behavioral.observer.subscriber.SmsNotificationSubscriber;
import com.jihyunum.patterns.behavioral.observer.subscriber.Subscriber;
import com.jihyunum.patterns.behavioral.strategy.formatter.AutoFormatter;
import com.jihyunum.patterns.behavioral.strategy.strategies.CamelCaseStrategy;
import com.jihyunum.patterns.behavioral.strategy.strategies.PascalCaseStrategy;
import com.jihyunum.patterns.behavioral.strategy.strategies.SnakeCaseStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) {
        CovidCasePublisher publisher = new CovidCasePublisher();

        Subscriber tempSubscriber = new EmailNotificationSubscriber("temp-subscriber@test.com");
        publisher.covidCaseManager.subscribe("South Korea", tempSubscriber);
        publisher.covidCaseManager.subscribe("South Korea", new EmailNotificationSubscriber("subscriber@test.com"));
        publisher.covidCaseManager.subscribe("South Korea", new SmsNotificationSubscriber("123-456-7890"));

        System.out.println(">> Day 1 <<");
        publisher.updateNumberOfCases("South Korea", 100);

        publisher.covidCaseManager.unsubscribe("South Korea", tempSubscriber);

        System.out.println(">> Day 2 <<");
        publisher.updateNumberOfCases("South Korea", 150);

    }
}
