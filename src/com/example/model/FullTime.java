package com.example.model;

public class FullTime extends Employee implements TaxCalculation{


    public FullTime(String name, String empId, long salary) {
        super(name, empId, salary);
    }

    @Override
    public double calculateTax() {
        return 0.30*this.getSalary()*0.03*this.getSalary()+0.02*this.getSalary();
    }
}
