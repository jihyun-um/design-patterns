package com.jihyunum.patterns.creational.prototype;

import com.jihyunum.patterns.creational.prototype.clothes.Clothes;
import com.jihyunum.patterns.creational.prototype.clothes.Jeans;
import com.jihyunum.patterns.creational.prototype.clothes.Shirt;
import com.jihyunum.patterns.creational.prototype.storage.ClothesStorage;

public class Demo {
    public static void main(String[] args) {
        ClothesStorage storage = getStockedUpStorage();

        Clothes jeans = storage.get("small-blue-short-jeans");
        Clothes shirt1 = storage.get("medium-white-stripe-shirt");
        Clothes shirt2 = storage.get("medium-white-stripe-shirt");

        System.out.println("shirt1 " + (shirt1.equals(jeans) ? "equals" : "does not equal") + " jeans");
        System.out.println("shirt1 " + (shirt1 == jeans ? "==" : "!=") + " jeans");

        System.out.println("shirt1 " + (shirt1.equals(shirt2) ? "equals" : "does not equal") + " shirt2");
        System.out.println("shirt1 " + (shirt1 == shirt2 ? "==" : "!=") + " shirt2");
    }

    private static ClothesStorage getStockedUpStorage() {
        ClothesStorage storage = new ClothesStorage();

        Shirt mediumWhiteStripeShirt = new Shirt();
        mediumWhiteStripeShirt.size = 16;
        mediumWhiteStripeShirt.color = "white";
        mediumWhiteStripeShirt.pattern = "stripe";

        Jeans smallBlueShortJeans = new Jeans();
        smallBlueShortJeans.size = 2;
        smallBlueShortJeans.color = "blue";
        smallBlueShortJeans.length = "short";

        storage.put("medium-white-stripe-shirt", mediumWhiteStripeShirt);
        storage.put("small-blue-short-jeans", smallBlueShortJeans);

        return storage;
    }
}
