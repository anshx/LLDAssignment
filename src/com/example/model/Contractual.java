package com.example.model;

public class Contractual extends Employee implements TaxCalculation{

    public Contractual(String name, String empId, long salary) {
        super(name, empId, salary);
    }

    @Override
    public double calculateTax() {
        return 0.20*this.getSalary() + 0.05*this.getSalary() + 0.02*this.getSalary();
    }
}
