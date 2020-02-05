package com.itacademy.day2.task1;


public class Employee {
    private String firstName;
    private String lastName;
    private String contractStartDate;
    private Double salary;
    private String position;
    private EmployeeType type;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String contractStartDate, Double salary, String position, EmployeeType type) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contractStartDate = contractStartDate;
        this.salary = salary;
        this.position = position;
        this.type = type;
    }

    public EmployeeType getType() {
        return type;
    }

    public void setType(EmployeeType type) {
        this.type = type;
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
    public String getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(String contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    public void printAllInformation(){
        System.out.println(firstName + " " + lastName);
        System.out.println("Started contract: "+contractStartDate);
        System.out.println("Salary: " + salary);
        System.out.println("Position " + position);
        System.out.println("Employee type " + type);
    }
}
