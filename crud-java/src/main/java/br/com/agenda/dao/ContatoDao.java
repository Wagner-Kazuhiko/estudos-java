package br.com.agenda.dao;

import br.com.agenda.factory.ConnectionFactory;
import br.com.agenda.model.Contato;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContatoDao {

    public void save(Contato contato) {

        String sql = "INSERT INTO contatos(nome, idade, datacadastro) VALUES (?, ?, ?)";

        try (Connection conn = ConnectionFactory.createConnectionToMySQL();
             PreparedStatement pstm = conn.prepareStatement(sql)) {

            pstm.setString(1, contato.getNome());
            pstm.setInt(2, contato.getIdade());
            pstm.setDate(3, new Date(contato.getDataCadastro().getTime()));

            pstm.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
