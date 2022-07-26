package com.revature.main;

import com.revature.model.Cat;
import com.revature.model.Dog;
import com.revature.model.Pet;

public class Driver {

    public static void main(String[] args) {

        Pet a1 = new Pet("Lucky", 4);
        Dog d1 = new Dog("Spot", 7);
        Cat c1 = new Cat("Whiskers", 5);

        System.out.println(a1.name);
        System.out.println(a1.age);
        a1.printBasicInfo();

        System.out.println(d1.name);
        System.out.println(d1.age);
        d1.printBasicInfo();

        System.out.println(c1.name);
        System.out.println(c1.age);
        c1.printBasicInfo();

        d1.playFetch(); // Spot is playing fetch!
        c1.playWithYarn(); // Whiskers is playing with yarn!

        Pet myDog = d1;
        myDog.printBasicInfo();

        Pet myCat = c1;
        myCat.printBasicInfo();

        // A Cat IS-A Pet
        // A Dog IS-A Pet
        // We can therefore utilize Pet reference variables to refer to Cat, Dog, AND Pet objects
        Pet myDog2 = new Dog("Sparky", 10);

        // myDog2.playFetch();
        // The variable type informs what you can access from that object, not the object type itself
        // Even though myDog2 is referring to a Dog object, we can't utilize playFetch, because myDog2 is a
        // Pet reference variable

        // Dog dog = (Dog) myDog2; // Downcasting from Pet to Dog
        // dog.playFetch(); // Sparky is playing fetch!

        ((Dog) myDog2).playFetch();

        Pet myCat2 = new Cat("Mittens", 8);

        // myCat2.playWithYarn();

        // Cat cat = (Cat) myCat2;
        // cat.playWithYarn();
        ((Cat) myCat2).playWithYarn();

        // Casting does not change the object's type, it changes the variable's type
        // If you are using a parent class' reference variable to refer to a child object, then you only have access
        // to the properties and methods available to that parent class (even though you are pointing to a child class)

        Pet myPet = new Dog("Fido", 11);

        ((Dog) myPet).playFetch();

        // Type safety
        // ((Cat) myPet).playWithYarn(); // ClassCastException

        play(myPet);

        Pet myPet2 = new Cat("Luna", 2);
        play(myPet2);
    }

    // This method is demonstrating the use of the "instanceof" operator
    // in order to avoid type-safety issues when downcasting to invoke the appropriate method in the subclasses of the Pet
    // superclass
    public static void play(Pet p) {
        // Check if p is referring to a Dog or referring to a Cat
        if (p instanceof Dog) {
            Dog d = (Dog) p;
            d.playFetch();
        } else if (p instanceof Cat) {
            Cat c = (Cat) p;
            c.playWithYarn();
        } else {
            System.out.println("This pet is neither a Dog or Cat, so we don't know what it should play");
        }
    }

}
