package com.example.driver;

import com.example.model.Contractual;
import com.example.model.Employee;
import com.example.model.FullTime;
import com.example.model.Intern;

public class MainApplication {
    public static void main(String[] args) {

        Employee e1 = new Contractual("Ram", "001", 1000L);
        Employee e2 = new FullTime("Shyam", "002", 2000L);
        Employee e3 = new Intern("Hari", "003", 500L);

        System.out.println(e1.calculateTax());
        System.out.println(e2.calculateTax());
        System.out.println(e3.calculateTax());

        System.out.println("Adding something garbabge");

    }
}
