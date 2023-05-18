package com.loiane.exercicios.aula19.exer;

import java.util.Locale;
import java.util.Scanner;

public class Exer02 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int vetorA[] = new int[8];
        int vetorB[] = new int[8];

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o valor da posição " + i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i] * 2;
        }

        System.out.print("Vetor B = ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorB[i] + " ");
        }


    }
}
