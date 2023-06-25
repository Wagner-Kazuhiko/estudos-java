package br.com.agenda.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static final String USERNAME = "admin";
    private static final String PASSWORD = "admin@1234";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/agenda";

    public static Connection createConnectionToMySQL() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
    }
}
