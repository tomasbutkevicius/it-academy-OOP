package com.itacademy.day2.task2;

public class Loan {
    private String id;
    private Double amount;
    private String terminationDate;
    LoanType type;

    public Loan() {
    }

    public Loan(String id, Double amount, String terminationDate, LoanType type) {
        this.id = id;
        this.amount = amount;
        this.terminationDate = terminationDate;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getTerminationDate() {
        return terminationDate;
    }

    public void setTerminationDate(String terminationDate) {
        this.terminationDate = terminationDate;
    }

    public LoanType getType() {
        return type;
    }

    public void setType(LoanType type) {
        this.type = type;
    }

    public void printLoanInformation(){
        System.out.println("ID: "+id);
        System.out.println("Amount: "+amount);
        System.out.println("Termination date: "+terminationDate);
        System.out.println("Loan type: " + type);
    }
}
