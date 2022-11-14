package aula19.array.exer;

import java.util.Locale;
import java.util.Scanner;

public class Exer10VetorResto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];

		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite a posição do vetor A número " + (1 + i));
			vetorA[i] = scan.nextInt();
		}
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorB[i] = vetorA[i] % 2;
		}
		
		System.out.println();
		System.out.println("----------------------------------------------");
		
		System.out.print("Vetor A = ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + ", ");
		}
		
		System.out.println();
		System.out.println("----------------------------------------------");
		
		System.out.print("Vetor B = ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorB[i] + ", ");
		}
		
		
	}

}
