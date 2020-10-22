package com.jihyunum.patterns.creational.factory_method.animals;

public class Dog implements Animal {
    @Override
    public void greet() {
        System.out.println("Woof Woof!");
    }
}
