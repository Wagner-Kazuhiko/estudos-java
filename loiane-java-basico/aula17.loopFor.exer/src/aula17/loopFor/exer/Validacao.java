package aula17.loopFor.exer;

import java.util.Locale;
import java.util.Scanner;

public class Validacao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		String nome;
		int idade;
		double salario;
		char sexo;
		char estadoCivil;
		
		do {
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("Digite o seu nome:");
			nome = scan.next();
			System.out.println("Digite a sua idade: ");
			idade = scan.nextInt();
			System.out.println("Digite o seu salário: ");
			salario = scan.nextDouble();
			System.out.println("Sexo f ou m: ");
			sexo = scan.next().charAt(0);
			System.out.println("Estado civil s (solteiro), c (casado), v (viúvo/a) ou d (divorciado/a)? ");
			estadoCivil = scan.next().charAt(0);
			
		}
		while(idade > 150 && idade < 0 && salario < 0 && sexo != 'm' || sexo != 'f' && estadoCivil != 's' || estadoCivil != 'c' || estadoCivil != 'v' || estadoCivil != 'd');
		
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("Validação completa: ");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado civil: " + estadoCivil);
	}

}
