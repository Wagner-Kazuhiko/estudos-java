package aula19.array.exer;

import java.util.Locale;
import java.util.Scanner;

public class Exer16SomaInferioresIguaisSuperiores15 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int[] vetor = new int[10];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Digite a posição do vetor número " + (i + 1));
			vetor[i] = scan.nextInt();
		}
		
		int somaInferior15 = 0;
		int somaIguais15 = 0;
		int somaSuperiores15 = 0;
		int qtdSuperior15 = 0;
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] < 15) {
				somaInferior15 += vetor[i];
			}
			else if(vetor[i] == 15) {
				somaIguais15 += vetor[i];
			}
			else if(vetor[i] > 15) {
				somaSuperiores15 += vetor[i];
				qtdSuperior15++;
			}
		}
		
		int media = somaSuperiores15 / qtdSuperior15;
		
		System.out.print("Vetor = ");
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + ", ");
		}
		
		System.out.println();
		
		System.out.println("Soma de inferiores a 15 é = " + somaInferior15);
		System.out.println("A soma de iguais a 15 é = " + somaIguais15);
		System.out.println("A média dos números superiores a 15 é = " + media);
		

	}

}
