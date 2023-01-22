package colecoes;

import java.util.*;

public class ConjuntoComportado {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

       // Set<String> list = new HashSet<String>();
       // Set<String> list = new TreeSet<>();
        SortedSet<String> list = new TreeSet<>();

        list.add("Ana");
        list.add("Carlos");
        list.add("Luca");
        list.add("Pedro");

        for (String candidato : list){
            System.out.println(candidato);
        }

        System.out.println("-------------------");

        System.out.println(list);

        System.out.println("-------------------");


        Set<Integer> nums = new TreeSet<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        for (Integer n : nums){
            System.out.println(n);
        }

        System.out.println("-------------------");
        System.out.println(nums);
    }
}
