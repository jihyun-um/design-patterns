package com.jihyunum.patterns.creational.builder;

import com.jihyunum.patterns.creational.builder.burrito.Burrito;
import com.jihyunum.patterns.creational.builder.burrito.BurritoBuilder;

public class Demo {
    public static void main(String[] args) {
        BurritoBuilder meatLoverBuilder = new BurritoBuilder()
                .type("wrap")
                .rice("white rice")
                .meat("beef")
                .condiments(new String[]{"hot salsa", "sour cream", "cheese"});
        Burrito meatLoverBurrito = meatLoverBuilder.build();
        System.out.println(">> Meat lover burrito <<\n" + meatLoverBurrito.toString());

        BurritoBuilder vegetarianBuilder = new BurritoBuilder()
                .type("bowl")
                .rice("brown rice")
                .vegetables(new String[]{"pinto beans", "lettuce"})
                .condiments(new String[]{"mild salsa", "guacamole"});
        Burrito vegetarianBurrito = vegetarianBuilder.build();
        System.out.println(">> Vegetarian burrito <<\n" + vegetarianBurrito.toString());
    }
}
