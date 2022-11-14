package aula17.loopFor.exer;

import java.util.Locale;
import java.util.Scanner;

public class Senha {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		String nome;
		int senha;
		
		do {
			System.out.println("------------------------------------------------");
			System.out.println("Digite o seu nome de usuário: ");
			nome = scan.next();
			System.out.println("Digite a sua senha de usuário: ");
			senha = scan.nextInt();
		}
		
		while (nome != "Lala" && senha != 123456);
			System.out.println("Nome ou senha incorretos! Digite novamente");

	}

}
