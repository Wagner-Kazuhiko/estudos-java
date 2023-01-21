package arrays;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("How many students? ");
        int quantityStudents = scan.nextInt();

        System.out.print("How many grades for students? ");
        int quantityGrades = scan.nextInt();

        double[][] grades = new double[quantityStudents][quantityGrades];

        double total = 0.0;
        for (int i = 0; i < grades.length; i++){
            for (int j = 0; j < grades[i].length; j++){
                System.out.printf("Input grade %d of student %d: ", 1 + j, 1+ i);
                grades[i][j] = scan.nextDouble();
                total += grades[i][j];
            }
        }

        double avg = total / (quantityStudents * quantityStudents);
        System.out.println("AVG = " + avg);

        for (double[] grade : grades){
            System.out.println(Arrays.toString(grades));
        }

        scan.close();
        
    }
}
