package com.ramsbrew;

public class LatteFactory implements DrinkFactory {
    public Drink createDrink() {
        return new Latte();
    }
}