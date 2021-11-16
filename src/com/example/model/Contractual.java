package com.example.model;

public class Contractual extends Employee {

    TaxCalculation taxCalculation;

    public Contractual(String name, String empId, long salary, TaxCalculation taxCalculation) {
        super(name, empId, salary);
        this.taxCalculation = taxCalculation;
    }

    public double calculateTax() {
        return taxCalculation.calculateTax(this.getSalary());
    }
    
}
