package aula19.array.exer;

import java.util.Locale;
import java.util.Scanner;

public class Exer14MediaAritmeticaVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite  posição do vetor A número " + (i + 1));
			vetorA[i] = scan.nextInt();
		}
		
		int soma = 0;
		int impar = 0;
		for(int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] % 2 != 0) {
				soma += vetorA[i];
				impar++;
			}
		}
		
		System.out.println();
		System.out.println("-------------------------------------");
		
		System.out.print("Vetor A = ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + ", ");
		}
		
		System.out.println("A soma dos números ímpares do vetor A é: " + soma);
		System.out.println("A média: " + (soma/impar));

	}

}
