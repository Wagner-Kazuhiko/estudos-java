package aula19.array.exer;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exer04VetorAIgualBRaiz {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[15];
		double[] vetorB = new double[vetorA.length];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o vetor número " + i);
			vetorA[i] = scan.nextInt();
		}
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorB[i] = Math.sqrt(vetorA[i]);
		}
		
		System.out.print("Vetor A = ");
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		DecimalFormat df = new DecimalFormat("###,###.###");
		
		System.out.print("Vetor B = ");
		for(int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}


	}

}
