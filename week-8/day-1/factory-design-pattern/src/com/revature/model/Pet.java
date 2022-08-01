package com.revature.model;

public abstract class Pet {

    // Property
    protected String name;

    // Constructor
    // You can't instantiate abstract classes, so why on earth do abstract classes have constructors?
    // Because a child concrete class can use super(...) to call the abstract class' constructor
    public Pet(String name) {
        this.name = name;
    }

    // Abstract method
    public abstract void play();

}
