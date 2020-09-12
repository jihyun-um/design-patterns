package com.jihyunum.patterns.creational.abstract_factory.app;

import com.jihyunum.patterns.creational.abstract_factory.containers.Container;
import com.jihyunum.patterns.creational.abstract_factory.factories.AppLayoutFactory;
import com.jihyunum.patterns.creational.abstract_factory.navs.Nav;

public class Application {
    private Nav nav;
    private Container container;

    public Application(AppLayoutFactory factory) {
        nav = factory.createNav();
        container = factory.createContainer();
    }

    public void display() {
        nav.displayMenus();
        container.displayContents();
    }
}
