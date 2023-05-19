package com.loiane.exercicios.aula19.exer;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exer04 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[15];
        double[] vetorB = new double[15];

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o valor da posição " + i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = Math.sqrt(vetorA[i]);
        }

        System.out.println();

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();

        DecimalFormat df = new DecimalFormat("###,###.###");

        System.out.print("Vetor B = ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(df.format(vetorB[i]) + " ");
        }
    }
}
