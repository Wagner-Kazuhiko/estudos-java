package aula19.array.exer;

import java.util.Locale;
import java.util.Scanner;

public class Exer03VetorAIgualQuadradoDeB {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o vetor número " + i);
			vetorA[i] = scan.nextInt();
		}
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorB[i] = vetorA[i] * vetorA[i];
		}
		
		System.out.println("----------------------------------------------");
		
		System.out.println("O vetor A = ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i] + " ");
		}
		
		System.out.println("----------------------------------------------");
		
		System.out.println("O vetor B = ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorB[i] + " ");
		}

	}

}
