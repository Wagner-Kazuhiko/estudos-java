package com.exercises.polimorfismo.exercise1.application;

import com.exercises.polimorfismo.exercise1.entities.ImportedProduct;
import com.exercises.polimorfismo.exercise1.entities.Product;
import com.exercises.polimorfismo.exercise1.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++){

            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char typeProduct = scan.next().charAt(0);
            System.out.print("Name: ");
            scan.nextLine();
            String name = scan.nextLine();
            System.out.print("Price: ");
            Double price = scan.nextDouble();


            if (typeProduct == 'c'){
                list.add(new Product(name, price));
            }
            else if (typeProduct == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date date = sdf.parse(scan.next());
                list.add(new UsedProduct(name, price, date));
            }
            else if (typeProduct == 'i'){
                System.out.print("Customs fee: ");
                Double customsFee = scan.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS: ");
        for (Product products : list){
            System.out.println(products.priceTag());
        }

        scan.close();
    }
}
