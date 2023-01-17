package com.poo.tratamentoexcecoes.exemplo1.application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        method1();

        System.out.println("END OF PROGRAM");


    }

    public  static void method1(){
        System.out.println("----METHOD1 START-------");
        method2();
        System.out.println("----METHOD1 END-------");
    }

    public static void method2(){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("----METHOD2 START------");

        try {
            String[] vect = scan.nextLine().split(" ");
            int position = scan.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position!");
            e.printStackTrace();
            scan.next();
        }
        catch (InputMismatchException e){
            System.out.println("Input error!");
        }

        System.out.println("----METHOD2 END-------");

        scan.close();
    }
}
