package aula46.orientacaoObjetos.InterfaceHeranca;

public interface SqlDDL {
	
	void create (String query);
	void alter (String query);
	void drop (String query);

}
