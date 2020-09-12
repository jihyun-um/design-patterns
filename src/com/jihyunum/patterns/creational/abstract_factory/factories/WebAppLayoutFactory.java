package com.jihyunum.patterns.creational.abstract_factory.factories;

import com.jihyunum.patterns.creational.abstract_factory.containers.Container;
import com.jihyunum.patterns.creational.abstract_factory.containers.WebAppContainer;
import com.jihyunum.patterns.creational.abstract_factory.navs.Nav;
import com.jihyunum.patterns.creational.abstract_factory.navs.WebAppNav;

public class WebAppLayoutFactory implements AppLayoutFactory {
    @Override
    public Nav createNav() {
        return new WebAppNav();
    }

    @Override
    public Container createContainer() {
        return new WebAppContainer();
    }
}
