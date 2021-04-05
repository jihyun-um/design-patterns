package com.jihyunum.patterns.creational.builder.burrito;

public interface FoodBuilder {
    FoodBuilder type(String type);
    FoodBuilder rice(String rice);
    FoodBuilder meat(String meat);
    FoodBuilder vegetables(String[] vegetables);
    FoodBuilder condiments(String[] condiments);
}
