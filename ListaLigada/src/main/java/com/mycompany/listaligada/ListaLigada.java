/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.listaligada;

import java.util.Scanner;

/**
 *
 * @author tonqu
 */
public class ListaLigada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lista l = new Lista();
        boolean exit = false;
        do {
            System.out.println("""
                                 Menu
                           1.- Agregar al inicio
                           2.- Agregar al final
                           3.- Eliminar el primero
                           4.- Eliminar el ultimo
                           5.- Busqueda
                           6.- Borrado por busqueda
                           7.- Imprimir
                           8.- Salir
                           """);
            if (scanner.hasNextInt()) {
                int op = scanner.nextInt();
                scanner.nextLine();
                switch (op) {
                    case 1:
                        System.out.println("Dato a agregar: ");
                        String add = scanner.nextLine();
                        l.agregarInicio(add);
                        break;
                    case 2:
                        System.out.println("Dato a agregar: ");
                        add = scanner.nextLine();
                        l.agregarFinal(add);
                        break;
                    case 3:
                        l.borrarInicio();
                        break;
                    case 4:
                        l.borrarFinal();
                        break;
                    case 5:
                        System.out.println("Dato que deseas buscar: ");
                        String bus = scanner.nextLine();
                        l.posicion(bus);
                        break;
                    case 6:
                        System.out.println("Dato que deseas borrar: ");
                        bus = scanner.nextLine();
                        l.borradoBusqueda(bus);
                        break;
                    case 7:
                        System.out.println(l.imprimir());
                        break;
                    case 8:
                        exit = true;
                        System.out.println("Saliendo... ");
                        break;
                    default:
                        System.out.println("Intenta de nuevo ");
                        break;

                }
            } else {
                System.out.println("Favor de ingresar un numero valido");
                scanner.nextLine();
            }
        } while (!exit);
    }
}
