package com.revature.model;

public class Dog {
    // static field
    public static int numberOfDogsCreated; // 0

    // instance fields
    public String name; // default value: null
    public int age; // default value: 0

    // default values for fields: false, 0, 0.0, null


    // Constructor overloading: multiple constructors, differentiated by the number of parameters and/or type of the parameters
    public Dog() { // User defined no-args constructor
        Dog.numberOfDogsCreated++;
    }

    // User defined parameterized constructor
    public Dog(String n, int a) { // n and a are method scoped
        // this.name and this.age are instance scoped

        this.name = n; // this.name is an instance field that we are setting for the new object being created
        this.age = a; // this.age is an instance field that we are setting for the new object being created

        Dog.numberOfDogsCreated++;
    }

    // instance methods (non-static methods)
    // Instance methods have access to instance-scope fields directly
    // That is because we know exactly what instance we're talking about, since instance methods can only be invoked
    // when you have a reference to an object
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void haveBirthday() {
        System.out.println(this.name + " has a birthday today!");
        this.age++;
    }

    // An instance method can access other instance methods directly
    public void printDetails() {
        System.out.println("name=" + getName() + " ,age=" + getAge());
    }

    // Static method
    public static int getNumberOfDogsCreated() {
        return Dog.numberOfDogsCreated; // Can refer directly to static field "numberOfDogsCreated"
    }

}
