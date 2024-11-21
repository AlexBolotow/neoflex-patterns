package com.bolotov.factory;

public class CoffeeFactory {

    public Coffee makeCoffee(CoffeeType coffeeType) {
        switch (coffeeType) {
            case ESPRESSO -> {
                return new Espresso();
            }

            case AMERICANO -> {
                return new Americano();
            }

            default -> throw new IllegalArgumentException("Unknown coffee type: " + coffeeType);
        }
    }
}
