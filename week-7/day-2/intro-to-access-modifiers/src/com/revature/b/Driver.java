package com.revature.b;

import com.revature.a.A;

// Demonstrating how "protected" works
public class Driver extends A {

    public static void main(String[] args) {
        A a = new A();
        // a.w = 10; // private: same class only
        // a.x = 15; // default: class inside of same package
        // a.y = 20; // protected: either a subclass or a class inside the same package
        a.z = 25; // public: any class anywhere

        Driver d = new Driver();

        // d.w = 10; // private: same class only
        // d.x = 15; // default: class inside of same package
        d.y = 20; // protected: either a subclass or a class inside the same package
        d.z = 25; // public: any class anywhere

        System.out.println(A.a); // static scoped variable (protected)
    }

}
