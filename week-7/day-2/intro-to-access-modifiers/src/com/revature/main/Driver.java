package com.revature.main;

import com.revature.a.A;

// Demonstrating how "public" works
public class Driver {

    public static void main(String[] args) {
        A a = new A();
        // a.w = 10; // private: same class only
        // a.x = 15; // default: class inside of same package
        // a.y = 20; // protected: either a subclass or a class inside the same package
        a.z = 25; // public: any class anywhere

        // can't directly access w (private)
        // a.w = 134;
        // System.out.println(a.w);

        // But we can utilize the getter/setter that we defined
        a.setW(134);
        System.out.println(a.getW());
    }

}
