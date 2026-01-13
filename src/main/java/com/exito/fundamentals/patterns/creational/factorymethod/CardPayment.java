package com.exito.fundamentals.patterns.creational.factorymethod;

public class CardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Card Payment.");
    }

}
