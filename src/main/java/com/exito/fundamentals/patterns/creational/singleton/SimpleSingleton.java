package com.exito.fundamentals.patterns.creational.singleton;

public class SimpleSingleton {
      // 1. Private static instance
    private static SimpleSingleton instance;
      // 2. Private constructor (VERY IMPORTANT)
    private SimpleSingleton() {
        // Private constructor to prevent instantiation

    }
     // 3. Public method to get the instance
    public static SimpleSingleton getInstance() {
        if (instance == null) {
            instance = new SimpleSingleton();
        }
        return instance;
    }
       // Example method
    public void sayHello() {
        System.out.println("Hello from Singleton 2");
    }
}
