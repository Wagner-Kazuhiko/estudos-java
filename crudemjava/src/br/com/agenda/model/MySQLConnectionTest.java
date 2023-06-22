package br.com.agenda.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnectionTest {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/agenda";
        String username = "admin";
        String password = "admin@1234";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Conexão com o banco de dados estabelecida!");
            connection.close();
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }
}

