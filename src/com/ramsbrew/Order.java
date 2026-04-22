package com.ramsbrew;

public class Order {
    private static int counter = 1000;

    private final int orderId;
    private final Drink drink;

    public Order(Drink drink) {
        this.orderId = ++counter;
        this.drink = drink;
    }

    public int getOrderId() {
        return orderId;
    }

    public Drink getDrink() {
        return drink;
    }

    @Override
    public String toString() {
        return "Order ID: " + orderId + "\n" + drink;
    }
}

