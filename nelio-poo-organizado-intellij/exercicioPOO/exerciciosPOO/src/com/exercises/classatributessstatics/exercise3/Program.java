package com.exercises.classatributessstatics.exercise3;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.println("Name: ");
        employee.name = scan.next();
        System.out.println("Gross salary: ");
        employee.grossSalary = scan.nextDouble();
        System.out.println("TAX: ");
        employee.tax = scan.nextDouble();
        System.out.println("Employee: " + employee.name + ", $ " + employee.netSalary());
        System.out.println("Which percentage to increase salary? ");
        employee.percentage = scan.nextDouble();
        employee.increaseSalary(employee.percentage);
        System.out.println("Updated data: " + employee.name + ", $" + employee.netSalary());
    }
}
