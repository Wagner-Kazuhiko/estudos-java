package aula50.exceptions.stacktraceEThrows;

public class ExceptionGenerica {
	
public static void main(String[] args) {
		
		int [] numeros = {4, 8, 16, 32, 64, 128};
		int [] demo = {2, 0, 4, 8, 0};
		
		for(int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + demo[i] + " = " + (numeros[i]/demo[i]));
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		
		}

	}

}
