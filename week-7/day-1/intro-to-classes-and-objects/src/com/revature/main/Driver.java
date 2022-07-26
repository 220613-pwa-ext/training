package com.revature.main;

import com.revature.model.Person; // In order to use the "Person" type and Person() constructor, we need to import the Person
// class
// Here we import the Person class from the package "com.revature.model"

// com.revature.main and com.revature.model are TWO SEPARATE packages
// There is no hierarchy for packages within Java
// If the full package name is different, then it's a totally different package from Java's perspective

public class Driver {

    // Static method
    public static void main(String[] args) {
//        Person p1 = new Person(); // the new keyword is used in conjunction with the constructor in order to create a new object
//        // Person() is invoking the constructor
//        // new is directing a new object to be created
//        Person p2 = new Person();
//        Person p3 = new Person();
//
//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p3);
//
//        // set properties for p1
//        p1.firstName = "John";
//        p1.lastName = "Doe";
//        p1.age = 25;
//
//        // set properties for p2
//        p2.firstName = "Jane";
//        p2.lastName = "Doe";
//        p2.age = 33;
//
//        // set properties for p3
//        p3.firstName = "Bach";
//        p3.lastName = "Tran";
//        p3.age = 24;

        Person p1 = new Person("John", "Doe", 25);
        Person p2 = new Person("Jane", "Doe", 33);
        Person p3 = new Person("Bach", "Tran", 24);

        printPropertiesOfPerson(p1);
        printPropertiesOfPerson(p2);
        printPropertiesOfPerson(p3);

        setFirstNameOfPerson(p1, "Richard");
        setFirstNameOfPerson(p2, "Emma");
        setFirstNameOfPerson(p3, "Bob");

        printPropertiesOfPerson(p1);
        printPropertiesOfPerson(p2);
        printPropertiesOfPerson(p3);

        // Not possible because Person is a blueprint, not an object
        // System.out.println(Person.firstName);
        // System.out.println(Person.lastName);
        // System.out.println(Person.age);

        // Accessing a property (static field) that belongs to the Person class
        System.out.println(Person.numberOfInstancesCreated); // 3

        p1.printProperties(); // invoke instance method that prints out properties associated with p1
        p2.printProperties(); // invoke instance method that prints out properties associated with p2
        p3.printProperties(); // invoke instance method that prints out properties associated with p3
    }

    // Static method
    public static void setFirstNameOfPerson(Person x, String fn) {
        x.firstName = fn; // Changing the firstName of Person object x
    }

    // Static method
    public static void printPropertiesOfPerson(Person x) {
        System.out.println("printPropertiesOfPerson() invoked");
        System.out.println("firstName=" + getFirstNameOfPerson(x) + " lastName=" + getLastNameOfPerson(x) + " age=" + getAgeOfPerson(x));
    }

    // Static method
    public static String getFirstNameOfPerson(Person x) {
        System.out.println("getFirstNameOfPerson() invoked");
        return x.firstName;
    }

    // Static method
    public static String getLastNameOfPerson(Person x) {
        System.out.println("getLastNameOfPerson() invoked");
       return x.lastName;
    }

    // Static method
    public static int getAgeOfPerson(Person x) {
        System.out.println("getAgeOfPerson() invoked");
        return x.age;
    }

}
