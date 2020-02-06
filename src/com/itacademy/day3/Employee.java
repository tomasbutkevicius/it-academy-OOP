package com.itacademy.day3;

public abstract class Employee {
    private String name;
    private int paymetPerHour;

    public Employee(String name, int paymetPerHour) {
        this.name = name;
        this.paymetPerHour = paymetPerHour;
    }

    public abstract int calculateSalary();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPaymetPerHour() {
        return paymetPerHour;
    }

    public void setPaymetPerHour(int paymetPerHour) {
        this.paymetPerHour = paymetPerHour;
    }
}
