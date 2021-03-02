package com.jihyunum.patterns.structural.composite.menus;

public class MenuItem implements Menu {
    String name;
    String url;

    public MenuItem(String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public String getMenuInfo() {
        return name + ": " + url;
    }
}
