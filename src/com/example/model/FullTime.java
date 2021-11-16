package com.example.model;

public class FullTime extends Employee {

    TaxCalculation taxCalculation;

    public FullTime(String name, String empId, long salary, TaxCalculation taxCalculation) {
        super(name, empId, salary);
        this.taxCalculation = taxCalculation;
    }

    public double calculateTax() {
        return taxCalculation.calculateTax(this.getSalary());
    }


}
