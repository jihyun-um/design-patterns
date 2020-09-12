package com.jihyunum.patterns.creational.abstract_factory.containers;

public class MobileAppContainer implements Container {
    @Override
    public void displayContents() {
        System.out.println("Mobile app contents");
    }
}
