package com.example.model;

public class ContractualTaxCalculation implements TaxCalculation{

    @Override
    public double calculateTax(long salary) {
        return 0.20*salary + 0.05*salary + 0.02*salary;
    }

}
