package com.exito.fundamentals.patterns.creational.factorymethod;

public class CashPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Cash Payment.");
    }

}
