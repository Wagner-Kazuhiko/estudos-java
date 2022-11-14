package aula19.array.exer;

import java.util.Locale;
import java.util.Scanner;

public class Exer12SomaElementosVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posiçao " + (i + 1));
			vetorA[i] = scan.nextInt();
		}
		
		int soma = 0;
		for(int i = 0; i < vetorA.length; i++) {
			soma += vetorA[i];
		}
		
		System.out.println();
		
		System.out.println("Soma: " + soma);

	}

}
