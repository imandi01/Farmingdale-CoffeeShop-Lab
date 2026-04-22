package com.ramsbrew;

public class DrinkStore {

    public Order placeOrder(String drinkType, Temperature temperature, Size size,
                            Milk milk, int shots, Sweetener sweetener) {

        DrinkFactory factory = getFactory(drinkType);
        Drink drink = factory.createDrink();

        DrinkBuilder builder = getBuilder(drinkType, drink);
        builder.setTemperature(temperature)
                .setSize(size)
                .setMilk(milk)
                .setShots(shots)
                .setSweetener(sweetener);

        Drink finishedDrink = builder.build();
        return new Order(finishedDrink);
    }

    private DrinkFactory getFactory(String drinkType) {
        if (drinkType == null) {
            throw new IllegalArgumentException("Drink type cannot be null.");
        }

        switch (drinkType.toLowerCase()) {
            case "coffee":
                return new CoffeeFactory();
            case "latte":
                return new LatteFactory();
            case "cappuccino":
                return new CappuccinoFactory();
            case "tea":
                return new TeaFactory();
            default:
                throw new IllegalArgumentException("Invalid drink type: " + drinkType);
        }
    }

    private DrinkBuilder getBuilder(String drinkType, Drink drink) {
        switch (drinkType.toLowerCase()) {
            case "coffee":
                return new CoffeeBuilder(drink);
            case "latte":
                return new LatteBuilder(drink);
            case "cappuccino":
                return new CappuccinoBuilder(drink);
            case "tea":
                return new TeaBuilder(drink);
            default:
                throw new IllegalArgumentException("Invalid drink type: " + drinkType);
        }
    }
}

