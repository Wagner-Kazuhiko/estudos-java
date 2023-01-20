package arrays;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Input quantity grades: ");
        int quantity = scan.nextInt();

        double[] grades = new double[quantity];

        for (int i = 0; i < grades.length; i++){
            System.out.println("Input grade #" + (1 + i) + ": ");
            grades[i] = scan.nextDouble();
        }

        System.out.println(Arrays.toString(grades));

        double sum = 0.0;

        for (double grade : grades){
            sum += grade;
        }

        double avg = sum / grades.length;
        System.out.println("AVG = " + avg);

        scan.close();


    }
}
