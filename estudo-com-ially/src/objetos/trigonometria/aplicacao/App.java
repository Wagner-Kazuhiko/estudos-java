package objetos.trigonometria.aplicacao;

import objetos.trigonometria.triangulo.Triangulo;

public class App {

    public static void main(String[] args) {

        Triangulo triangulo = new Triangulo(5.0, 7.0);
        triangulo.areaTriangulo();
        System.out.println(triangulo);

    }
}
