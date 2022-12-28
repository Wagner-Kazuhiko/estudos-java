package com.exercises.vetor.exercise4.alturas.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("How many people: ");
        int n = scan.nextInt();

        String[] names = new String[n];
        int[] ages = new int[n];
        double[] heights = new double[n];


        for (int i = 0; i < n; i++){
            System.out.println("Dates from the " + (1 + i) + " person: ");
            System.out.print("Name: ");
            names[i] = scan.next();
            System.out.print("Age: ");
            ages[i] = scan.nextInt();;
            System.out.print("Height: ");
            heights[i] = scan.nextDouble();
        }
        System.out.println();

        double sumHeight = 0.0;
        for (int i = 0; i < n; i++){
            sumHeight += heights[i];
        }
        double avgHeight = sumHeight / n;

        int cont = 0;
        for (int i = 0; i < n; i++){
            if (ages[i] < 16){
                cont ++;
            }
        }

        double percent = cont * 100.0 / n;

        System.out.printf("Average Height: %.2f%n", avgHeight);
        System.out.printf("People under 16 years: %.1f%n", percent);

        for (int i = 0; i < n; i++){
            if (ages[i] < 16){
                System.out.println(names[i]);
            }
        }





    }
}
