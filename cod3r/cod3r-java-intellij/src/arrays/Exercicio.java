package arrays;

import java.util.Arrays;
import java.util.Locale;

public class Exercicio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double[] notasAlunoA = new double[4];

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8.0;
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 9.7;

        System.out.println("ALUNO A");

        System.out.println(Arrays.toString(notasAlunoA));

        double totalAlunoA = 0.0;
        for (int i = 0; i < notasAlunoA.length; i++){
            totalAlunoA += notasAlunoA[i];
        }

        System.out.println(totalAlunoA / notasAlunoA.length);

        System.out.println("------------------------------");
        System.out.println("ALUNO B");

        double[] notasAlunoB = {6.9, 8.9, 5.5, 10};

        System.out.println(Arrays.toString(notasAlunoB));

        double totalAlunoB = 0.0;
        for (int i = 0; i < notasAlunoB.length; i++){
            totalAlunoB += notasAlunoB[i];
        }

        System.out.println(totalAlunoB / notasAlunoB.length);

    }
}
