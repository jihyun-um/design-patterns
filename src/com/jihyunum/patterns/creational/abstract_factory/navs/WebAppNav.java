package com.jihyunum.patterns.creational.abstract_factory.navs;

public class WebAppNav implements Nav {
    @Override
    public void displayMenus() {
        System.out.println("Web app menus");
    }
}
