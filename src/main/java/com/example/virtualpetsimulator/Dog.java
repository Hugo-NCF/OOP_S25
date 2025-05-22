package com.example.virtualpetsimulator;

public class Dog extends Pet {
    public Dog() {
        super();
    }

    @Override
    public String interact() {
        play();
        return "The dog wags its tail happily!";
    }
}
