package com.itacademy.day3;

public class Contractor extends Employee {
    private int workingHours;

    public Contractor(String name, int paymetPerHour) {
        super(name, paymetPerHour);
    }

    @Override
    public int calculateSalary() {
        return workingHours * getPaymetPerHour();
    }
}
