package com.itacademy.day3;

public class InsufficientFundsException extends Exception {
    private double ammount;

    public InsufficientFundsException(double ammount) {
        this.ammount = ammount;
    }

    public double getAmmount() {
        return ammount;
    }

    public void setAmmount(double ammount) {
        this.ammount = ammount;
    }
}
