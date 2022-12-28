package com.exercises.vetor.exercise2.numerosnegativos;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers are you going to type? ");
        int n = scan.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < n; i++){
            System.out.println("Enter a number: ");
            vect[i] = scan.nextInt();
        }

        System.out.println("NEGATIVES NUMBERS: ");
        for (int i = 0; i < n; i++){
            if (vect[i] < 0){
                System.out.println(vect[i]);
            }

        }

        scan.close();

    }
}
