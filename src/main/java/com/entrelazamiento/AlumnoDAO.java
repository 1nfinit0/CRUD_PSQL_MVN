package com.entrelazamiento;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlumnoDAO {
    public static void crearNuevoAlumno(Alumno alumno) {
        Conexion db_connect = new Conexion();
        try (Connection conexion = db_connect.get_connection()){
            PreparedStatement ps = null;
            try {
                String query = "Insert into drh.alumno (apellido, nombre, dni, fnacimiento) values (?,?,?,Date(?))";
                ps=conexion.prepareStatement(query);
                ps.setString(1, alumno.getApellido());
                ps.setString(2, alumno.getNombre());
                ps.setString(3, alumno.getDni());
                ps.setString(4, alumno.getFnacimiento());
                ps.executeUpdate();
                System.out.println("Alumno creado!");
            } catch (SQLException x) {
                System.out.println(x);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public static void leerAlumno() {
        
    }
    public static void borrarAlumno(int id) {
        
    }
    public static void actualizarAlumno(Alumno alumno) {
        
    }
}
