package com.example.virtualpetsimulator;

public abstract class Pet implements Interactable {
    protected int hunger;
    protected int happiness;

    public Pet() {
        this.hunger = 50;     // start at some mid value
        this.happiness = 50;
    }

    public void feed() {
        // Feeding increases hunger (pet is less hungry)
        hunger = Math.min(hunger + 10, 100);
    }

    public void play() {
        // Playing increases happiness
        happiness = Math.min(happiness + 10, 100);
        // No change to hunger here
    }

    public void tick() {
        // Time passing reduces hunger and happiness
        hunger = Math.max(hunger - 5, 0);
        happiness = Math.max(happiness - 5, 0);
    }

    public boolean isAlive() {
        // Pet dies if hunger or happiness drops to 0 or below
        return hunger > 0 && happiness > 0;
    }

    public String getStatus() {
        return String.format("Hunger: %d, Happiness: %d", hunger, happiness);
    }

    @Override
    public String interact() {
        play();
        return "You played with your pet.";
    }
}
