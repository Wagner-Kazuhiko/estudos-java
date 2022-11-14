package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Price: ");
        double price = scan.nextDouble();
        System.out.println("Quantity in stock: ");
        int quantity = scan.nextInt();
        Product product = new Product(name, price, quantity);

        System.out.println();
        System.out.println("Product data: " + product.toString());
        System.out.println();

        System.out.println("Enter the number of products to be added in stock: ");
        quantity = scan.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product.toString());

        System.out.println();
        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = scan.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product.toString());

        scan.close();
    }
}
