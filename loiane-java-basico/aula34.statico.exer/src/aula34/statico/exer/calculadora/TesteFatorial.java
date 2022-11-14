package aula34.statico.exer.calculadora;

import java.util.Locale;
import java.util.Scanner;

public class TesteFatorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int num;
		
		do {
			System.out.println("Entre com um número positivo");
			num = scan.nextInt();
			
			if (num < 0) {
				System.out.println("Número inválido, tente novamente");
			}
			
		}
		while(num < 0);
		
		System.out.println(MinhaCalculadora.fatorial(num));

	}

}
