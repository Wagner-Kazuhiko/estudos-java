

public class Carro {
	public String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	private double consumoCombustivel;
	
	public Carro () {
		
	}
	
	//com parametro não necessita criar (*carrox.marca=xxxx)
	public Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
		System.out.println("Chamando construtor com 5 parâmetros");
	}
	
	public Carro (String marca, String modelo) {
		this.marca = marca; this.modelo = modelo;
		System.out.println("Chamando o construtor com 2 parâmetros");
			
	}
	
	//metodo
	public void exibirAutonomia() {
		
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + "km");
	}
	//metodo sem void deve add return
	public double obterAutonomia() {
		
		System.out.println("Método obterAutonomia foi chamado.");
		
		return this.capCombustivel * this.consumoCombustivel;
	}
	
	private double divideKMPorCombustivel(double km) {
		return km/this.consumoCombustivel;
	}
	
	//como não exite a var km então deve se acrescentar um parametro
	public double calcularCombustivel(double km) {
		
		double qtdCombustivel = km / this.consumoCombustivel;
		
		return qtdCombustivel;
	}
}
