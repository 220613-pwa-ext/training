package com.revature.a;

public class A {

    protected static int a;

    // Non-static fields
    // Instance scoped variables
    private int w;
    int x; // default (no keyword)
    protected int y;
    public int z;

    /*
        Demonstrating how private works using getters/setters

        Getters/setters are used with *Encapsulation*
     */
    public int getW() {
        return w;
    }

    public void setW(int w) {
        // this.w is the instance scoped variable
        // w is the method scoped variable (method parameter)
        this.w = w;
    }

}
