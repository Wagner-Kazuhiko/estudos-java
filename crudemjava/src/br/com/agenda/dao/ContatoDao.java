package br.com.agenda.dao;

import br.com.agenda.factory.ConnectionFactory;
import br.com.agenda.model.Contato;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

public class ContatoDao {

    //CRUD: create, read, update e delete

    public void save(Contato contato){

        String sql = "INSERT INTO contatos(nome, idade, datacadastro) VALUES (?, ?, ?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            //criar uma conexão coom o banco de dados
            conn = ConnectionFactory.createConnectionToMySQL();

            //criamos uma preparedStatemant para executar uma query
            pstm = conn.prepareStatement(sql);
            //adicionar os valores que são esperados pela query
            pstm.setString(1, contato.getNome());
            pstm.setInt(2, contato.getIdade());
            pstm.setDate(3, new Date(contato.getDataCadastro().getTime()));

            //Executar a query
            pstm.execute();
        }

        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            //fechar as conexões
            try {
                if (pstm != null){
                    pstm.close();
                }
                if (conn != null){
                    conn.close();
                }
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }

}
