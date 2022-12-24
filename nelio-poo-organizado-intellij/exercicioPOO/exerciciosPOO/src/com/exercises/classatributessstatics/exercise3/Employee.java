package com.exercises.classatributessstatics.exercise3;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;
    public double percentage;

    public double netSalary(){
        return grossSalary - (grossSalary * tax) / 100;
    }

    public void increaseSalary(double percentage){
        grossSalary +=  (grossSalary * percentage) / 100 ;
    }
}
