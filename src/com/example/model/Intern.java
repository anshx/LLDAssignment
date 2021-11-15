package com.example.model;

public class Intern extends Employee implements TaxCalculation {

    public Intern(String name, String empId, long salary) {
        super(name, empId, salary);
    }

    @Override
    public double calculateTax() {
        return 0.2*this.getSalary();
    }
}
