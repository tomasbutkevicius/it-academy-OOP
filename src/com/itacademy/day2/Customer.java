package com.itacademy.day2;

import java.util.List;

public class Customer {
    private String firstName;
    private String lastName;
    private int age;
    private int personalNumber;
    private Loan[] loan;

    public Customer() {
    }

    public Customer(String firstName, String lastName, int age, int personalNumber, Loan[] loan) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.personalNumber = personalNumber;
        this.loan = loan;
    }

    public Loan[] getLoan() {
        return loan;
    }

    public void setLoan(Loan[] loan) {
        this.loan = loan;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(int personalNumber) {
        this.personalNumber = personalNumber;
    }


}

