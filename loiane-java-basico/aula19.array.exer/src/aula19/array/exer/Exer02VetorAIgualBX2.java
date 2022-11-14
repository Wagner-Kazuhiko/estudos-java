package aula19.array.exer;

import java.util.Locale;
import java.util.Scanner;

public class Exer02VetorAIgualBX2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[8];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com a entrada " + i);
			vetorA[i] = scan.nextInt();
		}
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorB[i] = vetorA[i] * 2;
		}
		
		System.out.println("Vetor A = ");
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i] + " ");
		}
		
		System.out.println("Vetor B = ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorB[i] + " ");
		}

	}

}
