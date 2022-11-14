package aula19.array.exer;

import java.util.Locale;
import java.util.Scanner;

public class Exer13SomaElementosMultiplos5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite a posiçao do vetor A numero " + (1 + i));
			vetorA[i] = scan.nextInt();
		}
		
		int soma = 0;
		for(int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] % 5 == 0) {
				soma += vetorA[i];
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
		
		System.out.print("Numeros da soma do Vetor A = " + soma);
		
	}

}
