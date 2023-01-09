package com.objects.encapsulament.account.application;

import com.objects.encapsulament.account.entities.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Account account = null;

        System.out.print("How many accounts to create? ");
        int n = scan.nextInt();
        List<Account> list = new ArrayList<>();

        for (int i = 0; i < n; i++){
            System.out.println("Account: #" + (i + 1));
            System.out.print("id: ");
            Integer id = scan.nextInt();
            System.out.print("name: ");
            scan.nextLine();
            String name = scan.nextLine();
            System.out.print("salary: ");
            Double salary = scan.nextDouble();

            account = new Account(id, name, salary);
            list.add(account);
        }

        System.out.println();
        System.out.println("List of accounts: ");
        for (Account obj : list){
            System.out.println(obj);
        }

        System.out.println("Enter the salary increase: ");
        for (int i = 0; i < n; i++){
            System.out.println("Account #" + (1 + i) + " percentage");
            double percentage = scan.nextDouble();
            account.increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of accounts: ");
        for (Account obj : list){
            System.out.println(obj);
        }

        scan.close();
    }
}
