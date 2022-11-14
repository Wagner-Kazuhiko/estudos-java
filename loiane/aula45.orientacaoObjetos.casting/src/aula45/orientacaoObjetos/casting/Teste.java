package aula45.orientacaoObjetos.casting;

public class Teste {

	public static void main(String[] args) {
		
		/*
		Aluno aluno = new Aluno();
		Pessoa pessoaAluno = aluno; //upcasting
		
		Pessoa aluno2 = (Pessoa) new Aluno();
		
		Aluno aluno3 = new Pessoa();
		Aluno aluno4 = (Aluno) aluno3;
		*/
		
		Pessoa pessoa = new Pessoa();
		Aluno aluno = new Aluno();
		Professor prof = new Professor();
		
		if (pessoa instanceof Pessoa) {
			System.out.println("é do tipo pessoa");
		}
		
		if (pessoa instanceof Aluno) {
			System.out.println("é do tipo aluno");
		}
		
		if (pessoa instanceof Professor) {
			System.out.println("é do tipo professor");
		}
		
		
		
	}

}
