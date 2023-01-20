package arrays;

import java.util.Locale;

public class ForEach {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double[] notas = {9.9, 8.7, 7.2, 9.4};

        for(int i = 0; i < notas.length; i++){
            System.out.println(notas[i] + " ");
        }

        System.out.println("----------------");

        for (double nota : notas){
            System.out.println(nota + " ");
        }
    }
}
