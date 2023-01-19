package com.loiane.exercicios.aulas28a33.construtoresencapsulamentosobrecarga.exer2.application;

import com.loiane.exercicios.aulas28a33.construtoresencapsulamentosobrecarga.exer2.entities.Account;
import com.loiane.exercicios.aulas28a33.construtoresencapsulamentosobrecarga.exer2.entities.SpecialAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        List<Account> list = new ArrayList<>();

        System.out.print("How many account numbers to create: ");
        double n = scan.nextDouble();
        Double balance = 0.0;

        for (int i = 1; i <= n; i++){
            System.out.println("Account #" + i + " data: ");
            System.out.print("Default account or Special account (d/s)? ");
            char typeAccount = scan.next().charAt(0);
            System.out.print("ID: ");
            Integer id = scan.nextInt();
            System.out.print("Name: ");
            scan.nextLine();
            String name = scan.nextLine();
            if (typeAccount == 'd'){
                list.add(new Account(id, name, balance));
            }
            else if (typeAccount == 's') {
                list.add(new SpecialAccount(id, name, balance));
            }
        }

        System.out.println();
        for (Account account : list){
            System.out.println(list);
        }

        scan.close();
    }
}
