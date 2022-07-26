package com.revature.main;

import com.revature.model.Pet;

public class Driver {

    public static void main(String[] args) {
        Pet p = new Pet("Whiskers", 10);

        // Cannot directly access name or age since they are private
        // p.name = "Mittens";
        // p.age = 11;
        // System.out.println(p.name);
        // System.out.println(p.age);

        System.out.println(p.getName()); // Whiskers
        System.out.println(p.getAge()); // 10
        p.setName("Mittens");
        p.setAge(11);
        System.out.println(p.getName()); // Mittens
        System.out.println(p.getAge()); // 11
    }

}
