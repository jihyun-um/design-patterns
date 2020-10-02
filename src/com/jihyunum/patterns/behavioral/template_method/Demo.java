package com.jihyunum.patterns.behavioral.template_method;

import com.jihyunum.patterns.behavioral.template_method.ecommerce.Amazon;
import com.jihyunum.patterns.behavioral.template_method.ecommerce.Ebay;
import com.jihyunum.patterns.behavioral.template_method.ecommerce.EcommerceApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        EcommerceApp ecommerce;
        String userName = "randomUser";
        String password = "randomPassword";

        System.out.println("Hello " + userName + ", do you want to shop at Amazon or Ebay?");

        String ecommerceName = reader.readLine();

        if ("amazon".equalsIgnoreCase(ecommerceName)) {
            ecommerce = new Amazon(userName, password);
        } else {
            ecommerce = new Ebay(userName, password);
        }
        ecommerce.logIn(userName, password);
        ecommerce.orderItem("randomItem");
        ecommerce.trackOrder("randomOrder");
    }
}
