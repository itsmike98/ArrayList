package com.mycompany.arraylist;

public class Persona {

    private String nombre;
    private String apellidos;
    private String dni;
    private int edad;
    private Direccion direccion;

    public Persona() {
    }

    public Persona(Direccion direccion) {
        this.direccion = direccion;
    }

    public Persona(String nombre, String apellidos, String dni, int edad,
            Direccion direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " Apellidos: " + apellidos + " DNI: "
                + dni + " Edad:" + edad + direccion.toString();
    }
}
