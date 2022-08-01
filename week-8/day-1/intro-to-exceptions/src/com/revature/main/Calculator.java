package com.revature.main;

import com.revature.exception.DenominatorCannotBeZeroException;

import java.io.IOException;

public class Calculator {

    // Method overloading
    public int divide(int numerator, int denominator) throws DenominatorCannotBeZeroException {
        if (denominator == 0) {
            throw new DenominatorCannotBeZeroException("Denominator cannot be zero");
            // we are instantiating a new ArithmeticException object and throwing it
        }

        return numerator / denominator;
    }

    public double divide(double numerator, double denominator) {
        return numerator / denominator;
    }

}
