package objetos.trigonometria.triangulo;

public class Triangulo {

    double x;
    double y;

    public Triangulo(double x, double y){
        this.x = x;
        this.y = y;
    }

   public double areaTriangulo (){
       return (x * y) / 2;
   }

    @Override
    public String toString() {
        return "Triangulo{" +
                "x=" + x +
                ", y=" + y +
                '}' + "Area do triângulo " + areaTriangulo();
    }
}
