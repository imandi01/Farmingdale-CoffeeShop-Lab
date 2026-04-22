package com.ramsbrew;
public class CappuccinoFactory implements DrinkFactory {
    public Drink createDrink() {
        return new Cappuccino();
    }
}
