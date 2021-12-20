package com.entrelazamiento;

import java.util.Scanner;

public class AlumnoService {
    public static void crearAlumno() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta apellido: ");
        String apellido = sc.nextLine();

        System.out.println("Inserta nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Inserta dni: ");
        String dni = sc.nextLine();

        System.out.println("Inserta fecha de nacimiento: ");
        String fnacimiento = sc.nextLine();

        Alumno registro = new Alumno();
        registro.setApellido(apellido);
        registro.setNombre(nombre);
        registro.setDni(dni);
        registro.setFnacimiento(fnacimiento);

        AlumnoDAO.crearNuevoAlumno(registro);
    }
    public static void listarAlumno() {
        
    }
    public static void borrarAlumno() {
        
    }
    public static void editarAlumno() {
        
    }
}
