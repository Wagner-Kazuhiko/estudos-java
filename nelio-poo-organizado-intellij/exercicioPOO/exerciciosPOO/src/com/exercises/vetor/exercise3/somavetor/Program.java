package com.exercises.vetor.exercise3.somavetor;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers? ");
        int n = scan.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < n; i++){
            System.out.print("Enter number " + (i + 1) + ": ");
            System.out.println();
            vect[i] = scan.nextInt();
        }

        System.out.print("VALUES: ");
        for (int i = 0; i < n; i++){
            System.out.print(vect[i] + " ");
        }

        System.out.println();
        double sum = 0.0;
        for (int i = 0; i < n; i++){
            sum += vect[i];
        }

        System.out.print("SOMA: " + sum);

        double avg = sum / n;

        System.out.println();
        System.out.println("AVERAGE: " + avg);
    }
}
