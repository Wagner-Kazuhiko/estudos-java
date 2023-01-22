package classe;

import java.util.Date;
import java.util.Locale;

public class Equals {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Usuario u1 = new Usuario();
        u1.nome = "Pedro Silva";
        u1.email = "pedro.silva@zemail.com.br";

        Usuario u2 = new Usuario();
        u1.nome = "Pedro Silva";
        u1.email = "pedro.silva@zemail.com.br";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));

        System.out.println(u2.equals(new Date()));


    }
}
