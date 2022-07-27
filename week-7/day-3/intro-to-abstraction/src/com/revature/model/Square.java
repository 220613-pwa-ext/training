package com.revature.model;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side); // Invoke the Rectangle constructor where length and width are the same (equal to the side parameter)
    }

}
