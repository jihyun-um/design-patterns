package com.jihyunum.patterns.creational.abstract_factory.factories;

import com.jihyunum.patterns.creational.abstract_factory.containers.Container;
import com.jihyunum.patterns.creational.abstract_factory.navs.Nav;

public interface AppLayoutFactory {
     Nav createNav();
     Container createContainer();
}
