package com.poo.interfaces.exercicio.application;

import com.poo.interfaces.exercicio.model.entities.Contract;
import com.poo.interfaces.exercicio.model.entities.Installment;
import com.poo.interfaces.exercicio.model.services.ContractService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato: ");
        System.out.print("Número: ");
        int number = scan.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(scan.next(), fmt);
        System.out.print("Valor do contrato: ");
        double totalValue = scan.nextDouble();

        Contract contract = new Contract(number, date, totalValue);

        System.out.print("Entre com o número de parcelas: ");
        int n = scan.nextInt();

        ContractService contractService = new ContractService(null);

        contractService.processContract(contract, n);

        System.out.println("Parcelas: ");
        for (Installment installment : contract.getInstallments()){
            System.out.println(installment);
        }

        scan.close();
    }
}
