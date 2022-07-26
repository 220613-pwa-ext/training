package com.revature.a;

// How "default" + "protected" works
public class Driver {

    public static void main(String[] args) {
        A a = new A();
        // a.w = 10; // private: same class only
        a.x = 15; // default: class inside of same package
        a.y = 20; // protected: either a subclass or a class inside the same package
        a.z = 25; // public: any class anywhere

        System.out.println(A.a); // static scoped variable (protected)
    }

}
