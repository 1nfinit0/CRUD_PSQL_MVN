package com.entrelazamiento;

public class Alumno {
    private int id;
    private String apellido;
    private String nombre;
    private String dni;
    private String fnacimiento;

    public Alumno(){

    }

    public Alumno(String apellido, String nombre, String dni, String fnacimiento) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.fnacimiento = fnacimiento;
    }

    public int getId() {
        return id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFnacimiento() {
        return fnacimiento;
    }

    public void setFnacimiento(String fnacimiento) {
        this.fnacimiento = fnacimiento;
    }
}

