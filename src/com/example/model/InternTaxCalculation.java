package com.example.model;

public class InternTaxCalculation implements TaxCalculation{
    @Override
    public double calculateTax(long salary) {
        return 0.2*salary;
    }
}
