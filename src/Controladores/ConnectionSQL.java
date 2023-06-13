package Controladores;

import java.sql.*;

public class ConnectionSQL {

    public static Connection getConnectionSQL() {
        String url = "jdbc:sqlserver://localhost:1433;"
                + "database=Biblioteca;"
                + "user=sa;"
                + "password=tecnm5810;"
                + "loginTimeout=30;";
        try {
            Connection con = DriverManager.getConnection(url);
            return con;
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }
}