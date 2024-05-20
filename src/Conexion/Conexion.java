package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private String url;
    private String user;
    private String password;

    public Conexion() {
        this.url = "jdbc:mysql://sql.freedb.tech:3306/freedb_gimnasio";
        this.user = "freedb_nestor_arce";
        this.password = "uwDrTJ7Xw!a8v!r";
    }

    public Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return DriverManager.getConnection(url, user, password);
    }


}
