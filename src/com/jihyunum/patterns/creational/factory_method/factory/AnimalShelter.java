package com.jihyunum.patterns.creational.factory_method.factory;

import com.jihyunum.patterns.creational.factory_method.animals.Animal;

public abstract class AnimalShelter {
    public void greetNewFamily() {
        Animal animal = rescueAnimal();
        animal.greet();
    }

    public abstract Animal rescueAnimal();
}
