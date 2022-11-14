package aula17.loopFor.exer;

import java.util.Scanner;

public class Exer16Fibonacci {

	public static void main(String[] args) {
		
		//até numero 500 da fibo
		
		int primeiro = 1;
		int segundo = 1;
		int proximo = 0;
		
		while(proximo <= 500){
			
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			
			System.out.println(proximo);
		}
	}

}
