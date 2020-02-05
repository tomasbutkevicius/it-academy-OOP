package com.itacademy.day2.task2;

public class LoansApplication {

    public static void main(String[] args) {
	// write your code here
        Customer customer = new Customer();
        customer.setFirstName("Zose");
        customer.setLastName("Gargasaite");
        customer.setAge(15);
        customer.setPersonalNumber(1546);
        Loan[] loans = new Loan[]{new Loan("1542", 14.01, "21-01-01", LoanType.LEASING), new Loan("154", 12.01,"22-12-12", LoanType.CONSUMER_LOAN)};
        customer.setLoans(loans);
        customer.printCustomerInformation();
    }
}
