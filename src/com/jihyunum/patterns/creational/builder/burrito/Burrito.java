package com.jihyunum.patterns.creational.builder.burrito;

import java.util.Arrays;

public class Burrito {
    private String type;
    private String rice;
    private String meat;
    private String[] vegetables;
    private String[] condiments;

    public Burrito(BurritoBuilder builder) {
        this.type = builder.type;
        this.rice = builder.rice;
        this.meat = builder.meat;
        this.vegetables = builder.vegetables;
        this.condiments = builder.condiments;
    }

    public String toString() {
        return "Your burrito " + type + " contains:\n" +
                getIngredientInfo(rice) +
                getIngredientInfo(meat) +
                getIngredientInfo(vegetables) +
                getIngredientInfo(condiments);
    }

    private String getIngredientInfo(String ingredient) {
        return ingredient == null ? "" : ingredient + "\n";
    }

    private String getIngredientInfo(String[] ingredients) {
        if (ingredients == null) {
             return "";
        }
        StringBuilder ingredientInfo = new StringBuilder();
        Arrays.stream(ingredients)
                .forEach(ingredient -> ingredientInfo.append(getIngredientInfo(ingredient)));
        return ingredientInfo.toString();
    }
}
