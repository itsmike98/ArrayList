package com.mycompany.arraylist;

import java.util.Scanner;

public class Main {

    //Prueba prueba prueba
    
    public static void main(String[] args) {

        Lista lista = new Lista();

        boolean cond = true;

        while (cond) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Opciones: \n"
                    + "\t1) Cargar.\n"
                    + "\t2) Listar.\n"
                    + "\t3) Insetar.\n"
                    + "\t4) Eliminar.\n"
                    + "\t5) Contar.\n"
                    + "\t6) Buscar.\n"
                    + "\t7) Salir.\n");

            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    lista.cargar();
                    break;
                case 2:
                    lista.listar();
                    break;
                case 3:
                    lista.insertar();
                    break;
                case 4:
                    lista.eliminar();
                    break;
                case 5:

                    System.out.println("Hay un total de " + lista.contar()
                            + " personas en la lista.");
                    break;
                case 6:
                    lista.buscar();
                    break;
                case 7:
                    cond = false;
                    break;
                default:
                    System.out.println("Valor invalido.\n");
            }
        }
    }
}
