

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	public Carro () {
		
	}
	
	//com parametro não necessita criar (*carrox.marca=xxxx)
	Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_) {
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
	void exibirAutonomia() {
		
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + "km");
	}
	//metodo sem void deve add return
	double obterAutonomia() {
		
		System.out.println("Método obterAutonomia foi chamado.");
		
		return this.capCombustivel * this.consumoCombustivel;
	}
	
	//como não exite a var km então deve se acrescentar um parametro
	double calcularCombustivel(double km) {
		
		double qtdCombustivel = km / this.consumoCombustivel;
		
		return qtdCombustivel;
	}
}
