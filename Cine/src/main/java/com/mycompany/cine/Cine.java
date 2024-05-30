/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.cine;

import java.util.Scanner;

/**
 *
 * @author tonqu
 */
public class Cine {

    public static void main(String[] args) {
        CineClass cine = new CineClass();
        cine.peliculas();
        Scanner scanner = new Scanner(System.in);
        Espectador view = new Espectador();
        boolean exit = false;
        do {
            System.out.println("""
                               1.- Comprar asiento
                               2.- Asientos vendidos
                               3.- Salir
                               """);
            int op = scanner.nextInt();
            scanner.nextLine();
            switch (op) {
                case 1:
                    System.out.println("Nombre de la persona");
                    String nombre = scanner.nextLine();
                    view.setNombre(nombre);
                    System.out.println("Edad de la persona");
                    int edad = scanner.nextInt();
                    view.setEdad(edad);
                    String cad = cine.posicion(view,edad);
                    System.out.println(cad);
                    break;
                case 2:
                    cad = cine.asientosVendidos();
                    System.out.println(cad);
                    break;
              
                case 3:
                    exit = true;
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Intenta de nuevo... ");
                    break;

            }
        } while (!exit);
    }
}
