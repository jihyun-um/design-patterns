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

        System.out.println("Hello " + userName + ", do you want to shop at Amazon or Ebay?");
        String ecommerceName = reader.readLine();

        System.out.println("Which item do you want to shop?");
        String itemId = reader.readLine();

        if ("amazon".equalsIgnoreCase(ecommerceName)) {
            ecommerce = new Amazon(userName);
        } else {
            ecommerce = new Ebay(userName);
        }
        ecommerce.shop(userName, itemId);
    }
}
