package com.ramsbrew;

public class CappuccinoBuilder implements DrinkBuilder {
    private final Drink drink;

    public CappuccinoBuilder(Drink drink) {
        this.drink = drink;
    }

    @Override
    public DrinkBuilder setTemperature(Temperature temperature) {
// Cappuccino is treated as hot only for this lab
        drink.setTemperature(Temperature.HOT);
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
        if (shots < 1) {
            shots = 1;
        } else if (shots > 3) {
            shots = 3;
        }
        drink.setShots(shots);
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