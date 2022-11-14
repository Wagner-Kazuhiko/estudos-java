package aula37.heranca;

public class Teste {

	public static void main(String[] args) {
		
		/*
		Aluno aluno = new Aluno();
		
		Professor professor = new Professor();
		
		Pessoa pessoa = new Pessoa();
		
		aluno.setNome("Maria");
		*/
		
		//professor.setTelefoneCelular(telefoneCelular);
		
		//Pessoa é uma super classe da classe aluno, dessa forma não terá acesso aos recursos do aluno, e sim do aluno contido em pessoa
		Pessoa aluno = new Aluno();
		aluno.getNome();

	}

}
