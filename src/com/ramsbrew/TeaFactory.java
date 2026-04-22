package com.ramsbrew;

public class TeaFactory implements DrinkFactory {
    @Override
    public Drink createDrink(){
        return new Tea();
    }
}
