package com.example.virtualpetsimulator;

public class Cat extends Pet {
    public Cat() {
        super();
    }

    @Override
    public String interact() {
        play();
        return "The cat purrs contentedly.";
    }
}
