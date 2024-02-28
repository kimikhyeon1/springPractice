package org.example.practicespring.designPattern.factoryMethod;

public class Dog extends Animal{
    @Override
    AnimalToy getToy() {
        return new DogToy();
    }
}
