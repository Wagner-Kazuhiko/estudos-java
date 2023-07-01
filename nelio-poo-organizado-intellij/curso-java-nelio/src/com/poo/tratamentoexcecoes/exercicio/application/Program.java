package com.poo.tratamentoexcecoes.exercicio.application;

import com.poo.tratamentoexcecoes.exercicio.model.entities.Account;
import com.poo.tratamentoexcecoes.exercicio.model.exceptions.BusinessException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws BusinessException {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = scan.nextInt();
        System.out.print("Holder: ");
        scan.nextLine();
        String holder = scan.nextLine();
        System.out.print("Initial balance: ");
        double balance = scan.nextDouble();
        System.out.print("Withdraw limit: ");
        double withDrawLimit = scan.nextDouble();

        Account account = new Account(number, holder, balance, withDrawLimit);

        System.out.println();
        System.out.print("Enter ammount for withdraw: ");
        double ammount = scan.nextDouble();

        try{
            account.withdraw(ammount);
            System.out.printf("New balance: %.2f%n", account.getBalance());
        }
        catch (BusinessException e){
            System.out.println(e.getMessage());

        }

        scan.close();

    }
}
