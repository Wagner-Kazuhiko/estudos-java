package aula52.exceptions.CriandoException;

public class UsandoMinhaException {

	public static void main(String[] args) {
		try {
			teste();
		}
		catch(DivisaoNaoExata e) {
			e.printStackTrace();
		}
			
		}
		public static void teste() throws DivisaoNaoExata{
			
			int [] numeros = {4, 8, 16, 32, 64, 128};
			int [] deno = {2, 0, 4, 8, 0};
			
			for(int i = 0; i < numeros.length; i++) {
				try {
					if(numeros[i] % 2 != 0) {
						//lançar exception aqui
						throw new DivisaoNaoExata(numeros[i], deno[i]);
					}
					System.out.println(numeros[i] + "/" + deno[i] + " = " + (numeros[i]/deno[i]));
				}
				catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
					System.out.println("Aconteceu um erro");
					e.printStackTrace();
				}
				
			}

		}

	}


