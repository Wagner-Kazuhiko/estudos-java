package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de elementos do vetor: ");
        int n = scan.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < n; i++){
            System.out.println("Digite o valor do vetor na posição " + i);
            vect[i] = scan.nextDouble();
        }

        double sum = 0;
        for(int i = 0; i < n; i++){
            sum += vect[i];
        }

        double average = sum / n;

        System.out.printf("AVERAGE HEIGHT: %.2f.%n", average);

        scan.close();
    }
}
