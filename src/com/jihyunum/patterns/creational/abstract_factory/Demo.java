package com.jihyunum.patterns.creational.abstract_factory;

import com.jihyunum.patterns.creational.abstract_factory.app.Application;
import com.jihyunum.patterns.creational.abstract_factory.factories.AppLayoutFactory;
import com.jihyunum.patterns.creational.abstract_factory.factories.MobileAppLayoutFactory;
import com.jihyunum.patterns.creational.abstract_factory.factories.WebAppLayoutFactory;

public class Demo {
    private static Application setUpApplication(String appType) throws Exception {
        Application app;
        AppLayoutFactory factory;

        if ("mobile".equals(appType)) {
            factory = new MobileAppLayoutFactory();
            app = new Application(factory);
        } else if ("web".equals(appType)) {
            factory = new WebAppLayoutFactory();
            app = new Application(factory);
        } else {
            throw new Exception("Unsupported app type: " + appType);
        }

        return app;
    }

    public static void main(String[] args) throws Exception {
        String appType = args[0];
        System.out.println("App type: " + appType);

        Application app = setUpApplication(appType);
        app.display();
    }
}
