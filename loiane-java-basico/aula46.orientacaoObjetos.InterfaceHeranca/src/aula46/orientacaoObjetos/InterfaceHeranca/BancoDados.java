package aula46.orientacaoObjetos.InterfaceHeranca;

public interface BancoDados extends SqlDCL, SqlDML, SqlDDL{
	
	void abrirConexao();
	void fecharConexao();

}
