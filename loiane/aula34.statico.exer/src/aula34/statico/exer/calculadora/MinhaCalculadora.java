package aula34.statico.exer.calculadora;

public class MinhaCalculadora {

	public static int soma(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int subtrai(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int multiplica (int num1, int num2) {
		return num1 * num2;
	}
	
	public static int divide (int num1, int num2) {
		return num1 / num2;
	}
	
	public static double potencia (double num1, double num2) {
		return Math.pow(num1, num2);
	}
	
	public static double raiz (double num) {
		return Math.sqrt(num);
	}
	
	public static int fatorial (int num) {
		
		if (num == 0) {
			return 1;
		}
		int total = 1;
		for (int i = num; i > 1; i--) {
			total *= i;
		}
		
		return total;
	}
}
