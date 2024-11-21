package com.bolotov.factory;

public class CoffeeFactoryRunner {

    public static void main(String[] args) {
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        System.out.println(coffeeFactory.makeCoffee(CoffeeType.AMERICANO));
        System.out.println(coffeeFactory.makeCoffee(CoffeeType.ESPRESSO));
    }
}
