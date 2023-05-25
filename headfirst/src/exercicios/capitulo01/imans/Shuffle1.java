package exercicios.capitulo01.imans;

public class Shuffle1 {

    public static void main(String[] args) {

        int x = 3;

        while (x > 0){

            if (x == 1){
                System.out.print("d");
                x = x -1;
                break;
            }

            if (x == 2){
                System.out.print("b c");
            }

            if (x > 2){
                System.out.print("a");
            }

            x = x -1;;
            System.out.print("-");
        }






    }
}
