package com.jihyunum.patterns.creational.factory_method;

import com.jihyunum.patterns.creational.factory_method.factory.AnimalShelter;
import com.jihyunum.patterns.creational.factory_method.factory.CatShelter;
import com.jihyunum.patterns.creational.factory_method.factory.DogShelter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Welcome to the animal shelter, do you want to rescue a dog or a cat?");
        String animalType = reader.readLine();

        AnimalShelter animalShelter;
        if ("dog".equalsIgnoreCase(animalType)) {
            animalShelter = new DogShelter();
        } else {
            animalShelter = new CatShelter();
        }

        animalShelter.greetNewFamily();
    }
}
