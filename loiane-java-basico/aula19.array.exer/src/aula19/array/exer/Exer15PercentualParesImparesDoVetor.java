package aula19.array.exer;

import java.util.Locale;
import java.util.Scanner;

public class Exer15PercentualParesImparesDoVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com a posição do vetor A número " + (i + 1));
			vetorA[i] = scan.nextInt();
		}
		
		int qtdPar = 0;
		for(int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] % 2 == 0) {
				qtdPar++;
			}
		}
		
		int qtdImpar = 0;
		for(int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] % 2 != 0) {
				qtdImpar++;
			}
		}
		
		double porcentagemPar = (qtdPar * 100) / vetorA.length;
		double porcentagemImpar = (qtdImpar * 100) / vetorA.length;
		
		System.out.print("vetor A = ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		System.out.println("A porcetagem de números ímpares é de " + porcentagemImpar + "%");
		System.out.println("A porcentagem de números pares é de " + porcentagemPar + "%");
		
		

	}

}
