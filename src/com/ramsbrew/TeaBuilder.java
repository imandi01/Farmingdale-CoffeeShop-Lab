package com.ramsbrew;

public class TeaBuilder implements DrinkBuilder {
    private final Drink drink;

    public TeaBuilder(Drink drink) {
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
// Tea may or may not use milk; allowed here
        drink.setMilk(milk);
        return this;
    }

    @Override
    public DrinkBuilder setShots(int shots) {
// Tea is not an espresso drink
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
