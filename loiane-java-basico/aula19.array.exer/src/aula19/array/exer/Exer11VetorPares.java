package aula19.array.exer;

import java.util.Locale;
import java.util.Scanner;

public class Exer11VetorPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com a posiçao do vetor A numero " + (1 + i));
			vetorA[i] = scan.nextInt();
		}
		
		int qtdPares = 0;
		for(int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] % 2 == 0) {
				qtdPares ++;
			}
		}
		
		System.out.println();
		System.out.println("----------------------------------------------");
		
		System.out.print("Vetor A = ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + ", ");
		}
		
		System.out.println();
		System.out.println("----------------------------------------------");
		
		System.out.print("Numeros pares do Vetor A = " + qtdPares);
		

	}

}
