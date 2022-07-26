package com.revature.model;

public class Person {

    // Field: a variable declared at the class-level
    // 1. Instance fields (non-static variables)
    // 2. Static fields (static variables)

    // numberOfInstancesCreated is static, so it is a property that belongs to the Person class/blueprint itself
    public static int numberOfInstancesCreated; // 0

    // Reference type fields: default value of null
    // Primitives: 0 or 0.0 for numbers, false for boolean

    // firstName is non-static, so it does not belong to the Person class, it belongs to individual Person objects
    public String firstName; // null by default

    // lastName is non-static, so it does not belong to the Person class, it belongs to individual Person objects
    public String lastName; // null by default

    // age is non-static, so it does not belong to the Person class, it belongs to individual Person objects
    public int age; // 0

    // Constructor
    public Person(String firstName, String lastName, int age) {
        numberOfInstancesCreated++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Instance method
    public void printProperties() {
        System.out.println("firstName=" + this.firstName + " , lastName=" + this.lastName + " , age=" + this.age);
    }

}
