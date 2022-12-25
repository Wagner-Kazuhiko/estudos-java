package com.exercises.membrosestaticos.exercise1.application;

import com.exercises.membrosestaticos.exercise1.util.Valuation;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        Valuation.dollarPrice = scan.nextDouble();
        System.out.println("How many dollars will be bought? ");
        Valuation.quantity = scan.nextDouble();
        System.out.println("Amount to be paid in reais = " + Valuation.dollarValue());
    }
}
