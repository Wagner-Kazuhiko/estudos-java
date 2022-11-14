package aula35.recursividade.exer;

public class Fibonacci {
	
	public static int fibo (int num) {
		
		if (num < 2) {
			return 1;
		}
		
		return fibo(num -1) + fibo(num -2);
	}

}
