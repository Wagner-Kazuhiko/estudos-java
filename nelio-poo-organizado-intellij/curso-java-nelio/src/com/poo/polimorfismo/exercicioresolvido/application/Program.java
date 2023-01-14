package com.poo.polimorfismo.exercicioresolvido.application;

import com.poo.polimorfismo.exercicioresolvido.entities.Employee;
import com.poo.polimorfismo.exercicioresolvido.entities.OutsourceEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employee: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("Employee #" +  i + " data: ");
            System.out.print("Outsourced (y/n)? ");
            char decision = scan.next().charAt(0);
            System.out.print("Name: ");
            scan.nextLine();
            String name = scan.nextLine();
            System.out.print("Hours: ");
            Integer hours = scan.nextInt();
            System.out.print("Value per hour: ");
            Double valuePerHour = scan.nextDouble();
            if(decision == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = scan.nextDouble();
                list.add(new OutsourceEmployee(name, hours, valuePerHour, additionalCharge));
            }
            else {
                list.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println();
        System.out.println("PAYMENTS: ");
        for (Employee emp : list){
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }

        scan.close();
    }
}
