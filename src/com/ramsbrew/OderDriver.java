package com.ramsbrew;

public class OrderDriver {
    public static void main(String[] args) {
        DrinkStore store = new DrinkStore();

        Order order1 = store.placeOrder(
                "Coffee",
                Temperature.ICED,
                Size.LARGE,
                Milk.OAT,
                0,
                Sweetener.SUGAR
        );

        Order order2 = store.placeOrder(
                "Latte",
                Temperature.HOT,
                Size.MEDIUM,
                Milk.ALMOND,
                2,
                Sweetener.HONEY
        );

        Order order3 = store.placeOrder(
                "Cappuccino",
                Temperature.ICED, // builder will force HOT
                Size.SMALL,
                Milk.WHOLE,
                3,
                Sweetener.STEVIA
        );

        Order order4 = store.placeOrder(
                "Tea",
                Temperature.HOT,
                Size.MEDIUM,
                Milk.NONE,
                0,
                Sweetener.NONE
        );

        System.out.println("===== RAM'S BREW ORDERS =====\n");

        System.out.println(order1);
        System.out.println("\n-----------------------------\n");

        System.out.println(order2);
        System.out.println("\n-----------------------------\n");

        System.out.println(order3);
        System.out.println("\n-----------------------------\n");

        System.out.println(order4);
    }
}

