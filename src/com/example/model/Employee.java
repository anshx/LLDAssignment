package com.example.model;

public abstract class Employee implements TaxCalculation {
    private String name;
    private String empId;
    private long salary;

    public Employee(String name, String empId, long salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getEmpId() {
        return empId;
    }

    public long getSalary() {
        return salary;
    }
}
