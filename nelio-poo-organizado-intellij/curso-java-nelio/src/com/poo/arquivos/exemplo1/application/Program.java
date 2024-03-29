package com.poo.arquivos.exemplo1.application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        File file = new File("/home/kazu/notes/docker/docker-comandos.odt");
        Scanner scan = null;

        try {
            scan = new Scanner(file);
            while (scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());;
        }
        finally {
            if (scan != null) {
                scan.close();
            }
        }
    }
}
