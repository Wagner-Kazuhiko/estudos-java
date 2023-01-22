package colecoes;

import java.util.HashSet;
import java.util.Locale;

public class ConjuntoBaguncado {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);


        HashSet conjunto = new HashSet();
        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("Tamanho é " + conjunto.size());

        System.out.println("----------------------------------");

        conjunto.add("teste");
        conjunto.add('x');

        System.out.println("Tamanho é " + conjunto.size());

        System.out.println("----------------------------------");


        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.remove('x'));

        System.out.println("Tamanho é " + conjunto.size());

        System.out.println("----------------------------------");


        System.out.println(conjunto.contains('x'));
        System.out.println(conjunto.contains(1));
        System.out.println(conjunto.contains(false));
        System.out.println(conjunto.contains(true));

        System.out.println("----------------------------------");

        HashSet nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        System.out.println("----------------------------------");

        //conjunto.addAll(nums); // União entre dois conjuntos
        conjunto.retainAll(nums);
        System.out.println(conjunto);

        System.out.println("----------------------------------");

        conjunto.clear();
        System.out.println(conjunto);


    }
}
