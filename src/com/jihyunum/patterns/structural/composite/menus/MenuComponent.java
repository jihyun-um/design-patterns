package com.jihyunum.patterns.structural.composite.menus;

import java.util.ArrayList;
import java.util.List;

public class MenuComponent implements Menu {
    String name;
    String url;
    List<Menu> childMenus = new ArrayList<>();

    public MenuComponent(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public void addChildMenu(Menu childMenu) {
        childMenus.add(childMenu);
    }

    public void removeChildMenu(Menu childMenu) {
        childMenus.remove(childMenu);
    }

    public Menu getChildMenu(int index) {
        return childMenus.get(index);
    }

    @Override
    public String getMenuInfo() {
        StringBuilder menuInfo = new StringBuilder();
        menuInfo.append(name).append(": ").append(url);
        for (int index = 0; index < childMenus.size(); index++) {
            menuInfo.append("\n  ").append(index + 1).append(". ")
                    .append(childMenus.get(index).getMenuInfo());
        }
        return menuInfo.toString();
    }
}
