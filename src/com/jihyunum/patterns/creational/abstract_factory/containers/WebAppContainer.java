package com.jihyunum.patterns.creational.abstract_factory.containers;

public class WebAppContainer implements Container {
    @Override
    public void displayContents() {
        System.out.println("Web app contents");
    }
}
