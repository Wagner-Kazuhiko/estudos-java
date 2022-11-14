package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("-------------------------------------");
        System.out.println("PROGRAMA LEITURA DE NÚMEROS NEGATIVOS");
        System.out.println("-------------------------------------");

        System.out.println();

        System.out.println("Digite a quantidade de elementos do vetor: ");
        int n = scan.nextInt();
        int[] vetor = new int[n];

        for(int i = 0; i < vetor.length; i++){
            System.out.print("Digite um número: ");
            vetor[i] = scan.nextInt();
            System.out.println();
        }

        System.out.println("NÚMEROS NEGATIVOS ");
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] < 0){
                System.out.println(vetor[i]);
            }
        }
    }
}
