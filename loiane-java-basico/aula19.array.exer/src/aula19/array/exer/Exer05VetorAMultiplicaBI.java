package aula19.array.exer;

import java.util.Locale;
import java.util.Scanner;

public class Exer05VetorAMultiplicaBI {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o vetor número " + i);
			vetorA[i] = scan.nextInt();
		}
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorB[i] = vetorA[i] * i;
		}
		
		System.out.println("-------------------------------------");
		
		System.out.print("Vetor A = ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		System.out.println("-------------------------------------");
		
		System.out.print("Vetor B = ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
		

	}

}
