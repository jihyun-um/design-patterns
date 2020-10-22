package com.jihyunum.patterns.creational.factory_method.factory;

import com.jihyunum.patterns.creational.factory_method.animals.Animal;
import com.jihyunum.patterns.creational.factory_method.animals.Dog;

public class DogShelter extends AnimalShelter {
    @Override
    public Animal rescueAnimal() {
        return new Dog();
    }
}
