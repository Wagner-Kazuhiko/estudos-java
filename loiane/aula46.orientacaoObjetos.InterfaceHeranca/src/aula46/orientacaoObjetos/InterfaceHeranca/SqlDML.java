package aula46.orientacaoObjetos.InterfaceHeranca;

public interface SqlDML {
	
	void selectString (String query);
	void insert (String query);
	void delete (String query);
	void update (String query);

}
