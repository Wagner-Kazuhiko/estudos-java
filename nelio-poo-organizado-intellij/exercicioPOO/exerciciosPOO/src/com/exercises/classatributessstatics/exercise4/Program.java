package com.exercises.classatributessstatics.exercise4;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        Grades grades = new Grades();

        System.out.println("Name: ");
        grades.name = scan.next();
        System.out.println("Grade 1: ");
        grades.grade1 = scan.nextDouble();
        System.out.println("Grade 2: ");
        grades.grade2 = scan.nextDouble();
        System.out.println("Grade 3: ");
        grades.grade3 = scan.nextDouble();

        System.out.println(grades);
        System.out.println(grades.aprovedOrNot());

        scan.close();
    }
}
