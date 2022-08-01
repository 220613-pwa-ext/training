package com.revature.main;

// The singleton design pattern is a design pattern that essentially enforces
// that only a single instance of that class can exist in the entire application
// It's a way to have a "global" object that is accessible from anywhere
public class MySingleton {

    private static MySingleton myInstance;

    private MySingleton() {
    }

    public static MySingleton getInstance() {
        if (myInstance == null) { // myInstance == null will only be true the very first time getInstance is called
            // every time onwards in the application will result in it being false (because an object has already been created
            // the very first time)
            myInstance = new MySingleton();
        }

        return myInstance;
    }

    public void myInstanceMethod1() {
        System.out.println("This is an instance method");
    }

}
