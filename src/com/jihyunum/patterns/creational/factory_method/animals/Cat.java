package com.jihyunum.patterns.creational.factory_method.animals;

public class Cat implements Animal {
    @Override
    public void greet() {
        System.out.println("Meow!");
    }
}
