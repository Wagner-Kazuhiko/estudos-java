package aula46.orientacaoObjetos.figuraGeometrica.exer;

public class Circulo extends Figura2D{
	
	private double raio;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return (raio * raio) * Math.PI;
	}
	
	

}
