package com.entrelazamiento;

import java.sql.Connection;
import java.sql.SQLException;
/**
 * Hello world!
 *
 */
public class Inicio 
{
    public static void main( String[] args ){

        Conexion conexion = new Conexion();

        try (Connection cnx = conexion.get_connection()){
            
        } catch (SQLException e) {
            System.out.println(e);
        }

    }
}
