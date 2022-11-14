package aula48.exception.multiplosCatch;

public class MultiplosCatchJava7 {

	public static void main(String[] args) {
		
		int [] numeros = {4, 8, 16, 32, 64, 128};
		int [] demo = {2, 0, 4, 8, 0};
		
		for(int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + demo[i] + " = " + (numeros[i]/demo[i]));
			}
			catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
				System.out.println("Aconteceu um erro");
			}
			

		}
		
	}


}