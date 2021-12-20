package com.entrelazamiento;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public Connection get_connection() {
        Connection conection = null;

        try {
            conection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/sencico", "postgres", "postgres");
            if (conection != null) {
                System.out.println("Conectado!");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return conection; 

    }
}
