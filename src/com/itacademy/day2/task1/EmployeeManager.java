package com.itacademy.day2.task1;


public class EmployeeManager {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setContractStartDate("20-01-01");
        employee.setType(EmployeeType.PART_TIME);
        employee.setFirstName("Giedrutis");
        employee.setLastName("Saboniukas");
        employee.setPosition("Profesionalus plovejas");
        employee.setSalary(4910.25);
        employee.printAllInformation();
    }
}
