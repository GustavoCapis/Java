package academy.devdojo.maratona.java.POO.bancodedados.domain;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbFunctions {
    public Connection connectDb(String dbname, String user, String pass) {
        Connection conn = null;

        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + dbname, user, pass);
            if (conn != null) {
                System.out.println("Conexao estabelecida com sucesso!");
            } else {
                System.out.println("Falha na conexao!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
