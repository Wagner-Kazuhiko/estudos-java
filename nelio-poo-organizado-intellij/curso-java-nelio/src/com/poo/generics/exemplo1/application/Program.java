package com.poo.generics.exemplo1.application;

import com.poo.generics.exemplo1.services.PrintService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        PrintService ps = new PrintService();

        System.out.print("How many values? ");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++){
            int value = scan.nextInt();
            ps.addValue(value);
        }

        ps.print();
        System.out.println("First: " + ps.first());

        scan.close();
    }
}
