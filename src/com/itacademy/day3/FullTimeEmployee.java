package com.itacademy.day3;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name, int paymetPerHour) {
        super(name, paymetPerHour);
    }
    @Override
    public int calculateSalary() {
        return getPaymetPerHour() * 8;
    }
}
