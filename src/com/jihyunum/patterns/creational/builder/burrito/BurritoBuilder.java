package com.jihyunum.patterns.creational.builder.burrito;

public class BurritoBuilder implements FoodBuilder {
    String type;
    String rice;
    String meat;
    String[] vegetables;
    String[] condiments;

    public BurritoBuilder() {}

    public Burrito build() {
        return new Burrito(this);
    }

    public BurritoBuilder type(String type) {
        this.type = type;
        return this;
    }

    public BurritoBuilder rice(String rice) {
        this.rice = rice;
        return this;
    }

    public BurritoBuilder meat(String meat) {
        this.meat = meat;
        return this;
    }

    public BurritoBuilder vegetables(String[] vegetables) {
        this.vegetables = vegetables;
        return this;
    }

    public BurritoBuilder condiments(String[] condiments) {
        this.condiments = condiments;
        return this;
    }
}
