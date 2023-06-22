package br.com.agenda.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    //Nome do usuario do mysql
    private static final String USERNAME = "admin";
    //Senha do banco de dados
    private static final String PASSWORD = "admin@1234";
    //caminho do banco de dados: porta, nome do banco de dados
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/agenda";

    /*
    Conexão com banco de dados
     */

    public static Connection createConnectionToMySQL() throws SQLException, ClassNotFoundException {
        //Faz com que a classe seja carregada pela JVM
        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);

        return connection;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        //recuperar conexão com o banco de dados (se tiver)
        Connection con = createConnectionToMySQL();

        //testar se a conexão é nula
        if (con != null){
            System.out.println("Conexão obtida com sucesso!");
            con.close();
        }
    }

}
