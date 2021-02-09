package com.jihyunum.patterns.behavioral.observer.subscriber;

public interface Subscriber {
    // update
    void notify(String message);
}
