package com.jihyunum.patterns.creational.abstract_factory.factories;

import com.jihyunum.patterns.creational.abstract_factory.containers.Container;
import com.jihyunum.patterns.creational.abstract_factory.containers.MobileAppContainer;
import com.jihyunum.patterns.creational.abstract_factory.navs.MobileAppNav;
import com.jihyunum.patterns.creational.abstract_factory.navs.Nav;

public class MobileAppLayoutFactory implements AppLayoutFactory {
    @Override
    public Nav createNav() {
        return new MobileAppNav();
    }

    @Override
    public Container createContainer() {
        return new MobileAppContainer();
    }
}
