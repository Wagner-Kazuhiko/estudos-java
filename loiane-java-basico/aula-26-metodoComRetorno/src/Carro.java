
public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	//metodo
	void exibirAutonomia() {
		
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + "km");
	}
	//metodo sem void deve add return
	double obterAutonomia() {
		
		System.out.println("Método obterAutonomia foi chamado.");
		
		return capCombustivel * consumoCombustivel;
	}

}
