package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class ProgramStudent {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Name: ");
        student.name = scan.nextLine();
        System.out.println("GRADE 1: ");
        student.grade1 = scan.nextDouble();
        System.out.println("GRADE 2: ");
        student.grade2 = scan.nextDouble();
        System.out.println("GRADE 3: ");
        student.grade3 = scan.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());

        if(student.finalGrade() < 60.0){
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
        }
        else{
            System.out.println("PASS");
        }
        scan.close();

    }
}
