package aula48.exception.multiplosCatch;

public class MultiplosCatchGenerico {

public static void main (String[] args) {
		
		int [] numeros = {4, 8, 16, 32, 64, 128};
		int [] demo = {2, 0, 4, 8, 0};
		
		for(int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + demo[i] + " = " + (numeros[i]/demo[i]));
			}
			//específica vem primeiro do que a genérica
			catch(ArithmeticException e1) {
				System.out.println("Erro ao dividir por zero");
			}
			
			//erro ou excessão genérica
			catch(Throwable e) {
				System.out.println("O correu um erro");
			}
			
		}
		
	}
}
