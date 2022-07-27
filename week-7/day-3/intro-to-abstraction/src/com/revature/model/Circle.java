package com.revature.model;

public class Circle extends Shape { // Concrete classes cannot have abstract methods
    // So if a concrete class inherits abstract methods from an abstract class, it must override those abstract methods

    private double radius;

    public Circle(double radius) { // radius is a method scoped variable
        this.radius = radius; // this.radius is an instance scoped variable
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
