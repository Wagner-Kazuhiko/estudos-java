package aula43.animais.exer;

public class Teste {

	public static void main(String[] args) {
		
		Animal camelo = new Animal();
		camelo.setNome("Camelo");
		camelo.setComprimento(1.50);
		camelo.setCor("Amarelo");
		camelo.setAmbiente("Terra");
		camelo.setVelocidade(2.0);
		
		Peixe tubarao = new Peixe();
		tubarao.setNome("Tubarão");
		tubarao.setComprimento(300.0);
		tubarao.setVelocidade(1.5);
		
		Mamifero urso = new Mamifero();
		urso.setNome("Urso-do-Canadá");
		urso.setComprimento(1.80);
		urso.setCor("Vermelho");
		urso.setAmbiente("Terra");
		urso.setVelocidade(0.5);
		
		Animal[] animais = new Animal[3];
		animais[0] = camelo;
		animais[1] = tubarao;
		animais[2] = urso;
		
		System.out.println("----------------------------");
		for(Animal animal : animais) {
			System.out.println(animal);
			System.out.println("----------------------------");
		}
		

	}

}
