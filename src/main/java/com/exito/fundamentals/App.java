package com.exito.fundamentals;
import com.exito.fundamentals.patterns.creational.factorymethod.Payment;
import com.exito.fundamentals.patterns.creational.factorymethod.PaymentFactory;
import com.exito.fundamentals.patterns.creational.singleton.SimpleSingleton;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SimpleSingleton singleton = SimpleSingleton.getInstance();
        singleton.sayHello();

        Payment payment1 = PaymentFactory.createPayment("CARD");
        payment1.pay(100.0);

        Payment payment2 = PaymentFactory.createPayment("CASH");
        payment2.pay(200.0);


    }
}
