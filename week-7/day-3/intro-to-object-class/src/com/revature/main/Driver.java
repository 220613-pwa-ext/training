package com.revature.main;

import com.revature.model.Person;

public class Driver {

    public static void main(String[] args) {
        String s = "Hello";
        String s2 = new String(new char[] {'H', 'e', 'l', 'l', 'o'});

        System.out.println(s == s2); // false
        System.out.println(s.equals(s2)); // true

        Person p = new Person(1, "John", "Doe");
        Person p2 = new Person(1, "John", "Doe");
        Person p3 = new Person(2, "Jane", "Doe");

        System.out.println(p == p2); // false
        System.out.println(p.equals(p2)); // true

        System.out.println(p2.equals(p3)); // false


        System.out.println(p);
        System.out.println(p2);
        System.out.println(p3);
    }

}
