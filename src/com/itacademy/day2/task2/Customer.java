package com.itacademy.day2.task2;

public class Customer {
    private String firstName;
    private String lastName;
    private int age;
    private int personalNumber;
    private Loan[] loans;
    private Double loanTotalAmount;

    public Customer() {
    }

    public Customer(String firstName, String lastName, int age, int personalNumber, Loan[] loans, Double loanTotalAmount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.personalNumber = personalNumber;
        this.loans = loans;
        this.loanTotalAmount = loanTotalAmount;
    }

    public Loan[] getLoans() {
        return loans;
    }

    public void setLoans(Loan[] loans) {
        this.loans = loans;
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

    private Double calculateLoanTotalAmount(Loan[] loans){
        loanTotalAmount = 0.0;
        for(int i=0; i<loans.length; i++){
            loanTotalAmount = loanTotalAmount + loans[i].getAmount();
        }
        return loanTotalAmount;
    }

    public Double getLoanTotalAmount() {
        return calculateLoanTotalAmount(this.loans);
    }

    public void setLoanTotalAmount(Double loanTotalAmount) {
        this.loanTotalAmount = loanTotalAmount;
    }

    public void printCustomerInformation(){
        /*
        private String firstName;
    private String lastName;
    private int age;
    private int personalNumber;
    private Loan[] loans;
    private Double loanTotalAmount;
         */
        System.out.println("Customer name is " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Personal number: " + personalNumber);
        System.out.println("Loan information:");
        for(int i=0;i<loans.length;i++){
            System.out.println("Loan "+ (i+1));
            loans[i].printLoanInformation();
        }
        System.out.println("Total in debt: "+ getLoanTotalAmount());
    }

}

