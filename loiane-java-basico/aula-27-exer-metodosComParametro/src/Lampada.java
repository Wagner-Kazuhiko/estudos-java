
public class Lampada {

	String modelo;
	String tensao;
	int potencia;
	String cor;
	String tipoLuz;
	int garantiaMeses;
	String[] tipos;
	boolean tipoAbajur;
	
	boolean ligada;
	
	void ligar() {
		ligada = true;
	}
	
	void desligar() {
		ligada = false;
	}
	
	void mostrarEstado() {
		if (ligada == true) {
			System.out.println("Lâmpada está ligada");
		}
		
		else {
		System.out.println("Lâmpada está desligada");
		}
	}
	
	void mudarEstado() {
		if (ligada == true) {
			desligar();
		}
		else {
			ligar();
		}
	}
}
