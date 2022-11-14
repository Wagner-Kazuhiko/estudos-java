package aula17.loopFor;

public class LoopFor {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("i tem valor " + i);
		}
		
		System.out.println("---------------------------------------------");
		
		for (int i = 10; i > 0; i--) {
			System.out.println("i tem valor " + i);
		}
		
		System.out.println("---------------------------------------------");
		
		for (int i = 10; i >= 0; i--) {
			System.out.println("i tem valor " + i);
		}
		
		System.out.println("---------------------------------------------");

		for(int i = 0, j = 10; i < j; i++, j--) {
			System.out.println("i = " + i + "; j = " + j);
		}
		
		System.out.println("---------------------------------------------");
		
		
		int count = 0;
		for ( ; count < 10; ) {
			System.out.println("Valor de count: " + count);
			count += 2;
		}
		
		System.out.println("---------------------------------------------");
		
		count = 0;
		for ( ; count < 10; count++) {
			System.out.println("Valor de count: " + count);
			count += 2;
		}
		
		System.out.println("---------------------------------------------");
		
		int soma = 0;
		for(int i = 1; i < 5; soma += i++);
		System.out.println("O valor da soma é " + soma);
		
		System.out.println("---------------------------------------------");

		for (int i = 0; i < 10; i++) {
			System.out.println("i tem valor " + i);
		}
	}

}
