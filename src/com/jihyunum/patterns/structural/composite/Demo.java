package com.jihyunum.patterns.structural.composite;

import com.jihyunum.patterns.structural.composite.menus.MenuComponent;
import com.jihyunum.patterns.structural.composite.menus.MenuItem;

public class Demo {
    public static void main(String[] args) {
        MenuComponent mainMenu = new MenuComponent("Main", "/main");
        mainMenu.addChildMenu(new MenuItem("Best Sellers", "/best-sellers"));
        mainMenu.addChildMenu(new MenuItem("New Releases", "/new-releases"));

        MenuComponent shopByDepartment = new MenuComponent("Shop By Department", "/shop-by-department");
        shopByDepartment.addChildMenu(new MenuItem("Books", "/books"));
        shopByDepartment.addChildMenu(new MenuItem("Clothes", "/clothes"));
        shopByDepartment.addChildMenu(new MenuItem("Food", "/food"));
        mainMenu.addChildMenu(shopByDepartment);

        MenuComponent settingMenu = new MenuComponent("Setting", "/setting");
        settingMenu.addChildMenu(new MenuItem("Your Account", "/account"));
        settingMenu.addChildMenu(new MenuItem("Customer Service", "/customer-service"));
        settingMenu.addChildMenu(new MenuItem("Sign In", "/sign-in"));

        System.out.println(mainMenu.getMenuInfo());
        System.out.println(settingMenu.getMenuInfo());
    }
}
