package aula17.loopFor.exer;

public class TesteLaco {

	public static void main(String[] args) {
			
			for(int linha = 0; linha < 10; linha++) {
				for(int coluna = 0; coluna <= 10; coluna++) {
					if(coluna > linha) {
						break;
					}
					System.out.print("*");
				}
				System.out.println();
			}

	}

}
