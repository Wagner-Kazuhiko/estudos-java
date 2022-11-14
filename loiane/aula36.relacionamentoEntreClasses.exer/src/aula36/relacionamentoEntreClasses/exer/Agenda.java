package aula36.relacionamentoEntreClasses.exer;

public class Agenda {
	
	private String nome;
	private Contato[] contatos;

	public Contato[] getContatos() {
		return contatos;
	}

	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}

	public Agenda() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String obterInfo() {
		String info = "Nome = " + nome + "\n";
		
		if (contatos != null) {
			for (Contato c : contatos) {
				info += c.obterInfo() + "\n";
			}
		}
		return info;
	}

}
