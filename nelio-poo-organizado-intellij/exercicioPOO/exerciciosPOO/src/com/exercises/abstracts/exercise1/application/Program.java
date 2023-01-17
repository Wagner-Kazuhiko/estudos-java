package com.exercises.abstracts.exercise1.application;

import com.exercises.abstracts.exercise1.entities.Company;
import com.exercises.abstracts.exercise1.entities.Individual;
import com.exercises.abstracts.exercise1.entities.TaxPayer;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("Tax payer #" + i + " data: ");
            System.out.print("Individual or company (i/c)? ");
            char type = scan.next().charAt(0);
            System.out.print("Name: ");
            scan.nextLine();
            String name = scan.nextLine();
            System.out.print("Annual income: ");
            Double annualIncome = scan.nextDouble();

            if (type == 'i'){
                System.out.print("Health expenditures: ");
                Double healthExpenditures = scan.nextDouble();
                list.add(new Individual(name, annualIncome, healthExpenditures));
            }
            else if (type == 'c') {
                System.out.print("Number of employees: ");
                Integer numberOfEmployees = scan.nextInt();
                list.add(new Company(name, annualIncome, numberOfEmployees));
            }

            double sum = 0.0;
            System.out.println();
            System.out.println("TAXES PAID: ");
            for (TaxPayer taxPayer : list){
                double tax = taxPayer.tax();
                System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", tax));
                sum += tax;
            }

            System.out.println();
            System.out.println("TOTAL TAXES: $ " + String.format("%,2f", sum));

            scan.close();

        }

    }
}
