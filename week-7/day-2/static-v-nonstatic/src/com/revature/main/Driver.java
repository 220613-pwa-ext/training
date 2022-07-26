package com.revature.main;

import com.revature.model.Dog;

public class Driver {

    public static void main(String[] args) {
        // System is a class
        // .out is a static field that exists on the System class
        // .println() is an instance method that is defined by the PrintStream object referred to by the "out" static field
        System.out.println("Hello world"); // System class <- JRE (runtime libraries)

        Dog d1 = new Dog("Sparky", 3);
        Dog d2 = new Dog("Clifford", 4);
        Dog d3 = new Dog("Spot", 2);

        Dog d4 = new Dog("Fido", 5);

        System.out.println(Dog.numberOfDogsCreated); // 4

        System.out.println(d4.getName()); // Fido
        System.out.println(d4.getAge()); // 5

        d4.haveBirthday(); // Fido has a birthday today!

        System.out.println(d4.getAge()); // 6

        d3.haveBirthday();
        d2.haveBirthday();
        d1.haveBirthday();

        System.out.println(d1.age);
        System.out.println(d2.age);
        System.out.println(d3.age);

        d1.printDetails();
        d2.printDetails();
        d3.printDetails();
        d4.printDetails();

    }

}
