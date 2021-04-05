package com.jihyunum.patterns.creational.singleton.non_thread_safe;

public final class NaiveSingleton {
    private static NaiveSingleton instance;

    private NaiveSingleton() {}

    public static NaiveSingleton getInstance() {
        if (instance == null) {
            instance = new NaiveSingleton();
        }
        return instance;
    }
}
