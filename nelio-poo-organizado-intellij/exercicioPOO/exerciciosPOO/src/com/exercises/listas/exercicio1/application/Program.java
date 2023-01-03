package com.exercises.listas.exercicio1.application;

import com.exercises.listas.exercicio1.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("How many employees will be registred? ");
        int n = scan.nextInt();

        List<Employee> list = new ArrayList<>();

        for (int i = 0; i < n; i++){
            System.out.println();
            System.out.println("Employee #" + (i + 1) + ": ");
            System.out.print("Id: ");
            Integer id = scan.nextInt();
            System.out.print("Name: ");
            scan.nextLine();
            String name = scan.nextLine();
            System.out.print("salary: ");
            Double salary = scan.nextDouble();

            Employee employee = new Employee(id, name, salary);

            list.add(employee);
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int idSalary = scan.nextInt();
        Employee employee = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
        if(employee == null){
            System.out.println("This id does not exist! ");
        }
        else{
            System.out.print("Enter the percentage: ");
            double percentage = scan.nextDouble();
            employee.increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employee:");
        for (Employee obj : list){
            System.out.println(obj);
        }

        scan.close();

    }

    public static boolean hasId(List<Employee> list, int id){
        Employee employee = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return employee!= null;
    }
}
