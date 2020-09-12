package com.jihyunum.patterns.creational.abstract_factory.navs;

public class MobileAppNav implements Nav {
    @Override
    public void displayMenus() {
        System.out.println("Mobile app menus");
    }
}
