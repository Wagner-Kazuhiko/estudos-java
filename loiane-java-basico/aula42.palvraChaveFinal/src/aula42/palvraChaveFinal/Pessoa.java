package aula42.palvraChaveFinal;

public final class Pessoa {
	//final caracteriza-se como uma constante
	
	
	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	
	private String telefoneCelular;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		
	}
	public String getTelefoneCelular() {
		return telefoneCelular;
	}
	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	//para transformar o método em abstract, deve-se retirar as chaves (o corpo do metodo)
	//public abstract String obterEtiquetaEndereco();
	
	//declarando o mesmo metodo existente nas classes com as heranças, deve-se acrescentar o método abstract nelas tbm
	//public abstract void imprimirEtiquetaEndereco();

	

}
