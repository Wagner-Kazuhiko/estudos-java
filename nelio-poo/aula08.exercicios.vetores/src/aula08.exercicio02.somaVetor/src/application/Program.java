package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de elementos do vetor: ");
        int n = scan.nextInt();

        double[] vetor = new double[n];

        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite o elemento na posição " + i);
            vetor[i] = scan.nextDouble();
        }

        System.out.print("Valores: ");
        for (int i = 0; i < vetor.length; i++){
            System.out.print(" " + vetor[i]);
        }

        double sum = 0;
        double average = 0;

        System.out.println();

        for(int i = 0; i < vetor.length; i++){
            sum += vetor[i];
        }

        average = sum / vetor.length;

        System.out.println("SOMA = " + sum);
        System.out.println("AVERAGE = " + average);



    }
}
