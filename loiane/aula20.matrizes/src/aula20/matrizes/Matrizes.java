package aula20.matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double[][] notasAlunos = new double[30][4];

		for(int i = 0; i < notasAlunos.length; i++) {
			for(int j = 0; j < notasAlunos[i].length; j++) {
				System.out.println("Digite as notas dos alunos: " + i + " " + j);
				notasAlunos[i][j] = scan.nextDouble();
			}
		}
		for(int i = 0; i < notasAlunos.length; i++) {
			for(int j = 0; j < notasAlunos[i].length; j++) {
				System.out.print(notasAlunos[i][j]);
			}
		}
		
	}

}
