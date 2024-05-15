package com.mycompany.arraylist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Lista {

    private ArrayList<Persona> miArrayList;

    public Lista() {
        this.miArrayList = new ArrayList<>();
    }

    
    public void cargar(){
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myDb", "User_Miguel", "password")){
            
        }catch(SQLException e ){
            e.printStackTrace();
        }
    }

    public void listar() {
        for (Persona persona : miArrayList) {
            System.out.println(persona.toString());
        }
    }

    public void insertar() {
        Scanner sc = new Scanner(System.in);
        Direccion newDireccion = new Direccion();
        Persona newPersona = new Persona(newDireccion);
        System.out.print("Nombre: ");
        newPersona.setNombre(sc.next());
        System.out.println("\nApellidos: ");
        newPersona.setApellidos(sc.next());
        System.out.print("\nDNI: ");
        newPersona.setDni(sc.next());
        System.out.print("\nEdad: ");
        newPersona.setEdad(sc.nextInt());
        System.out.print("\nCalle: ");
        newDireccion.setCalle(sc.next());
        System.out.print("\nCodigo Postal: ");
        newDireccion.setCp(sc.nextInt());
        System.out.print("\nProvincia: ");
        newDireccion.setProvincia(sc.next());
        miArrayList.add(newPersona);
    }

    public void eliminar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("DNI de la persona que se quiere eliminar: ");
        String dni = sc.next();
        Iterator<Persona> iterator = miArrayList.iterator();
        boolean encontrado = false;
        while (iterator.hasNext()) {
            Persona persona = iterator.next();
            if (persona.getDni().equals(dni)) {
                iterator.remove();
                encontrado = true;
                System.out.println("La persona se elimino con exito.");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró ninguna persona con ese DNI.");
        }
    }

    public int contar() {
        return miArrayList.size();
    }

    public void buscar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("DNI de la persona que se quiere buscar: ");
        String dni = sc.next();
        boolean encontrado = false;
        for (Persona persona : miArrayList) {
            if (persona.getDni().equals(dni)) {
                System.out.println(persona.toString());
                encontrado = true;
            }
        }
        if (encontrado == false) {
            System.out.println("No se encontró ninguna persona con ese DNI.");
        }
    }
}
