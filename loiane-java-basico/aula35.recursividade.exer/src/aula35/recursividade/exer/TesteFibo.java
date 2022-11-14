package aula35.recursividade.exer;

public class TesteFibo {

	public static void main(String[] args) {
		
		for (int i = 0; i < 20; i++) {
			System.out.println(Fibonacci.fibo(i));
		}
		
		int fibo = Fibonacci.fibo(3);
		System.out.println(fibo);
		

	}

}
