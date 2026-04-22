package com.ramsbrew;

public class CoffeeFactory implements DrinkFactory {
    @Override
    public Drink createDrink(){
        return new Coffee();
    }
}
