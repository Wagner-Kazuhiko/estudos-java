package aula17.loopFor.exer;

import java.util.Locale;
import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		
		while(num != 7 && num <= 10) {
			System.out.println("--------------------------------------------------------------");
			System.out.println("Digite um número de 0 a 10 até encontrar o número secreto: ");
			num = scan.nextInt();
		}

	}

}
