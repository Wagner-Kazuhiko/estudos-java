package aula41.heranca.classesAbstratas;

public class Teste {

	public static void main(String[] args) {
		
		//com a declaração de abstract na classe pessoa, ocorre erro na hora de instânciar
		//Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		//pessoa.setEndereco("Rua 1, num 1 ");
		aluno.setEndereco("Rua 2, num 2");
		professor.setEndereco("Rua 3, num 3");
		
		
		//polimorfismo
		//System.out.println(pessoa.obterEtiquetaEndereco());
		//System.out.println(aluno.obterEtiquetaEndereco());
		//System.out.println(professor.obterEtiquetaEndereco());
		
		//apenas subclasses podem ser instanciadas
		//com abstract diminui o codigo de cima
		aluno.imprimirEtiquetaEndereco();
		professor.imprimirEtiquetaEndereco();
		
	}

}
