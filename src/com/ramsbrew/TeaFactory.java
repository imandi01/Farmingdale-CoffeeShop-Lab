package com.ramsbrew;

public class TeaFactory implements DrinkFactory {
    public Drink createDrink() {
        return new Tea();
    }
}