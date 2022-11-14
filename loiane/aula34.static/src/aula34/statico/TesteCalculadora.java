package aula34.statico;


public class TesteCalculadora {
	
	static int resultSoma;

	public static void main(String[] args) {
		
		resultSoma = MinhaCalculadora.soma(1, 2);
		
		//MinhaCalculadora calc = new MinhaCalculadora();
		
		//calc.soma(1, 2);
		
		//metodo static facilta e diminui as linhas
		MinhaCalculadora.soma(1, 2);
		
		//se retirar o static não funciona
		soma2Valores(1, 2);

	}
	
	static int soma2Valores(int num1, int num2) {
		return MinhaCalculadora.soma(num1, num2);
	}

}
