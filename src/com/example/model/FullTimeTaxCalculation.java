package com.example.model;

public class FullTimeTaxCalculation implements TaxCalculation{

    @Override
    public double calculateTax(long salary) {
        return 0.30*salary*0.03*salary+0.02*salary;
    }

}
