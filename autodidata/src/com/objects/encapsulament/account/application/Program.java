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

        Account account;

        System.out.print("How many accounts to create? ");
        int n = scan.nextInt();
        List<Account> list = new ArrayList<>();

        for (int i = 0; i < n; i++){
            System.out.println("Account: #" + (i + 1));
            System.out.print("id: ");
            Integer id = scan.nextInt();
            System.out.print("name: ");
            String name = scan.nextLine();
            System.out.println();
            account = new Account(id, name);
        }

        





        scan.close();
    }
}
