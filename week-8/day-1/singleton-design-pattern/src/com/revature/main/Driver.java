package com.revature.main;

public class Driver {

    public static void main(String[] args) {
        System.out.println(MySingleton.getInstance()); // com.revature.main.MySingleton@<hashed memory address>
        System.out.println(MySingleton.getInstance());
        System.out.println(MySingleton.getInstance());
        System.out.println(MySingleton.getInstance());
        System.out.println(MySingleton.getInstance());
        System.out.println(MySingleton.getInstance());

        MySingleton myInstance = MySingleton.getInstance();
        System.out.println(myInstance);
    }

    // Real world use-case: dependency injection
    // Java framework -> Spring framework
    // Spring framework utilizes the concept of dependency injection
    // It's where you have a centralized container that automatically configures and "stores" instances of classes
    // Whenever a particular instance requires another instance of something else, then the framework will "inject"
    // that instance into the dependent instance
    // Instances managed by Spring framework are by default "Singletons"

    // Angular <- frontend framework
    // Utilizes dependency injection
    // Every "injectable" is a singleton

}
