package com.poo.tratamentoexcecoes.exemplo1.application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        try {
            String[] vect = scan.nextLine().split(" ");
            int position = scan.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position!");
        }
        catch (InputMismatchException e){
            System.out.println("Input error!");
        }


        System.out.println("END OF PROGRAM");

        scan.close();
    }
}
