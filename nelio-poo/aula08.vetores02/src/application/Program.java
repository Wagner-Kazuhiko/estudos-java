package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de elementos do vetor: ");
        int n = scan.nextInt();
        Product[] vect = new Product[n];

        for(int i = 0; i < n; i++){
            scan.nextLine();
            String name = scan.nextLine();
            double price = scan.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++){
            sum += vect[i].getPrice();
        }

        double average = sum / n;

        System.out.printf("AVERAGE PRICE = %.2f%n", average);

        scan.close();

    }
}
