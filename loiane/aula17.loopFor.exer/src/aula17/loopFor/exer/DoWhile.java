package aula17.loopFor.exer;

import java.util.Locale;
import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int num;
		do {
			System.out.println("----------------------------");
			System.out.println("Advinhe o número");
			System.out.println("Escolha um número de 0 - 10");
			System.out.print("Digite o número escolhido: ");
			num = scan.nextInt();
			
		}
		while (num != 7 && num <= 10); 
		System.out.println("Acertou! O número é o " + num );
		

	}

}
