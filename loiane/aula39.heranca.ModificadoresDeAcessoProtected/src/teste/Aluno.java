package teste;

import aula39.heranca.ModificadoresDeAcessoProtected.Pessoa;

public class Aluno extends Pessoa{
	
	
	private String curso;
	private double[] notas;
	
	public void verificarAcesso() {
		
		this.nomeVisibilidade = "sesdfr";
		super.nomeVisibilidade = "gddghddh";
		
		this.setNomeVisibilidade("curso");
		
		super.setNomeVisibilidade("curso");
		
		
	}
	
	
	public Aluno() {
		super();
	}
	
	
	
	
	
	public Aluno(String nome, String endereco, String telefone, String curso) {
		super(nome, endereco, telefone);
		this.curso = curso;
	}





	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia() {
		return 0;
	}
	
	public boolean verificarAprovado() {
		return true;
	}
	
	public void metodoQualquer() {
		super.setCpf("13424647858");
		
		this.setCpf("1637647474");
	}
	
	
	

}
