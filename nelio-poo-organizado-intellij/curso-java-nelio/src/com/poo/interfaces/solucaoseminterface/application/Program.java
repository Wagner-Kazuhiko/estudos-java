package com.poo.interfaces.solucaoseminterface.application;

import com.poo.interfaces.solucaoseminterface.model.entities.CarRental;
import com.poo.interfaces.solucaoseminterface.model.entities.Vehicle;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo de carro: ");
        String carModel = scan.nextLine();
        System.out.println("Retirada (dd//yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(scan.nextLine(), fmt);
        System.out.println("Retorno (dd//yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(scan.nextLine(), fmt);


        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));



        scan.close();
    }
}
