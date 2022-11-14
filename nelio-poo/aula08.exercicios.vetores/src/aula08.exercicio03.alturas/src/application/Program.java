package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas: ");
        int n = scan.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for(int i = 0; i < nomes.length; i++){
            System.out.println("Digite os dados da " + (1 + i) + "a pessoa: ");
            System.out.print("Nome: ");
            nomes[i] = scan.next();
            System.out.println();
            System.out.print("Idade: ");
            idades[i] = scan.nextInt();
            System.out.println();
            System.out.print("Altura: ");
            alturas[i] = scan.nextDouble();
            System.out.println();
        }

        double menores = 0;
        double somaAlturas = 0;
        for(int i = 0; i < nomes.length; i++){
            if (idades[i] < 16){
                menores++;
            }
            somaAlturas += alturas[i];
        }

        double percentualMenores = (menores / n) * 100.0;
        double mediaAlturas = somaAlturas / n;

        System.out.println();
        System.out.printf("\nAltura media = %.2f\n", mediaAlturas);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

        for(int i = 0; i < nomes.length; i++){
            if (idades[i] < 16){
                System.out.printf("%s\n", nomes[i]);
            }
        }

        scan.close();
    }
}
