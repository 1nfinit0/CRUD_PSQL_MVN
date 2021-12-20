package com.entrelazamiento;

import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class Inicio 
{
    public static void main( String[] args ){

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("-------------------------------");
            System.out.println("MAIN MENÚ");
            System.out.println("1) Crear Alumno");
            System.out.println("2) Listar Alumnos");
            System.out.println("3) Editar (actualizar) Alumno");
            System.out.println("4) Eliminar Alumno");
            System.out.println("5) Salir");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    AlumnoService.crearAlumno();
                    break;
                case 2:
                    AlumnoService.listarAlumno();
                    break;
                case 3:
                    AlumnoService.editarAlumno();
                    break;
                case 4:
                    AlumnoService.borrarAlumno();
                    break;
                default:
                    break;
            }

        } while (opcion != 5);
    }
}
