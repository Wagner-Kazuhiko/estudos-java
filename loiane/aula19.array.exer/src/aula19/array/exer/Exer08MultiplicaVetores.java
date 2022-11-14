package aula19.array.exer;

import java.util.Locale;
import java.util.Scanner;

public class Exer08MultiplicaVetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[10];

		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com a posição do vetor A número " + (1 + i));
			vetorA[i] = scan.nextInt();
		}
		
		System.out.println("-----------------------------");
		System.out.println();
		
		for(int i = 0; i < vetorB.length; i++) {
			System.out.println("Entre com a posição do vetor B número " + (1 + i));
			vetorB[i] = scan.nextInt();

		}
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorC[i] = vetorA[i] * vetorB[i]; 
		}
		
		System.out.println();
		System.out.println("--------------------------------------");
		
		System.out.print("Vetor A = ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		System.out.println("--------------------------------------");

		System.out.print("Vetor B = ");
		for(int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
		System.out.println();
		System.out.println("--------------------------------------");

		System.out.print("Vetor C = ");
		for(int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		}


	}
}
