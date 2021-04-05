package com.jihyunum.patterns.creational.singleton;

import com.jihyunum.patterns.creational.singleton.non_thread_safe.NaiveSingleton;
import com.jihyunum.patterns.creational.singleton.thread_safe.ThreadSafeSingleton;
import com.jihyunum.patterns.structural.composite.menus.MenuComponent;
import com.jihyunum.patterns.structural.composite.menus.MenuItem;

public class Demo {
    public static void main(String[] args) {
        NaiveSingleton naiveSingletonInstance1 = NaiveSingleton.getInstance();
        NaiveSingleton naiveSingletonInstance2 = NaiveSingleton.getInstance();

        System.out.println(naiveSingletonInstance1 == naiveSingletonInstance2);

        ThreadSafeSingleton threadSafeSingletonInstance1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton threadSafeSingletonInstance2 = ThreadSafeSingleton.getInstance();

        System.out.println(threadSafeSingletonInstance1 == threadSafeSingletonInstance2);
    }
}
