package application;

import entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        double dollarPrice = scan.nextDouble();
        System.out.println("How many dollars will be bought? ");
        int quantity = scan.nextInt();

        System.out.println("Amount to be paid in reais = R$ " + CurrencyConverter.boughtDollar(dollarPrice, quantity));
    }
}
