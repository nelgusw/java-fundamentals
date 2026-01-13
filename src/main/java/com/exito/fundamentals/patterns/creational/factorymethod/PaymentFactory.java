package com.exito.fundamentals.patterns.creational.factorymethod;

public class PaymentFactory {

    public static Payment createPayment(String type) {
        if (type.equalsIgnoreCase("CASH")) {
            return new CashPayment();
        } else if (type.equalsIgnoreCase("CARD")) {
            return new CardPayment();
        }
        throw new IllegalArgumentException("Unknown payment type: " + type);
    }
}
