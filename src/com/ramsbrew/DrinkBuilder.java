package com.ramsbrew;

public interface DrinkBuilder {
    DrinkBuilder setTemperature(Temperature temperature);
    DrinkBuilder setSize(Size size);
    DrinkBuilder setMilk(Milk milk);
    DrinkBuilder setShots(int shots);
    DrinkBuilder setSweetener(Sweetener sweetener);
    Drink build();
}
