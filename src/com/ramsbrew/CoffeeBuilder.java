package com.ramsbrew;

public class CoffeeBuilder implements DrinkBuilder {
    private final Drink drink;

    public CoffeeBuilder(Drink drink) {
        this.drink = drink;
    }

    @Override
    public DrinkBuilder setTemperature(Temperature temperature) {
        drink.setTemperature(temperature);
        return this;
    }

    @Override
    public DrinkBuilder setSize(Size size) {
        drink.setSize(size);
        return this;
    }

    @Override
    public DrinkBuilder setMilk(Milk milk) {
        drink.setMilk(milk);
        return this;
    }

    @Override
    public DrinkBuilder setShots(int shots) {
// Coffee is not treated as an espresso drink here
        drink.setShots(0);
        return this;
    }

    @Override
    public DrinkBuilder setSweetener(Sweetener sweetener) {
        drink.setSweetener(sweetener);
        return this;
    }

    @Override
    public Drink build() {
        return drink;
    }
}
