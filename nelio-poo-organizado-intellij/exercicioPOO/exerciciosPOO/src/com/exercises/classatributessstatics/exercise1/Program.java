package com.exercises.classatributessstatics.exercise1;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Triangle x = new Triangle();
        System.out.println("Enter the measures of triangle X: ");
        x.a = scan.nextDouble();
        x.b = scan.nextDouble();
        x.c = scan.nextDouble();

        Triangle y = new Triangle();
        System.out.println("Enter the measures of triangle Y: ");
        y.a = scan.nextDouble();
        y.b = scan.nextDouble();
        y.c = scan.nextDouble();

        double pX = (x.a + x.b + x.c) / 2;
        double areaX = Math.sqrt(pX * ( pX - x.a) * (pX - x.b) * (pX - x.c));

        double pY = (y.a + y.b + y.c) / 2;
        double areaY = Math.sqrt(pY * ( pY - y.a) * (pY - y.b) * (pY - y.c));

        System.out.println("Triangle X area: " + areaX);
        System.out.println("Triangle Y area: " + areaY);

        if(areaX > areaY){
            System.out.println("Larger area: X");
        }
        else if (areaY > areaX) {
            System.out.println("Larger area: Y");
        }

        scan.close();
    }
}
