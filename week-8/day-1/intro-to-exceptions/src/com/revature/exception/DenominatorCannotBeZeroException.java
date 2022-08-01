package com.revature.exception;

public class DenominatorCannotBeZeroException extends Exception {

    public DenominatorCannotBeZeroException() {
    }

    public DenominatorCannotBeZeroException(String message) {
        super(message); // Invoking the parent class constructor (Exception class)
    }

}
