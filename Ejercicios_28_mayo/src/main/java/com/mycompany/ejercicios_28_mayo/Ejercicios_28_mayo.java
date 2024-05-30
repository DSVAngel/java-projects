/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicios_28_mayo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author tonqu
 */
public class Ejercicios_28_mayo {

    public static int randomNumber() {
        Random random = new Random();
        int dato = 0;
        dato = random.nextInt((999) + 1);

        return dato;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lista lista = new Lista();
        Lista lista2 = new Lista();
        Lista lista3 = new Lista();
        boolean exit = false;
        do {
            System.out.println("""
                           1.- Crear lista uno 
                           2.- Elimar rango primera lista
                           3.- Imprimir lista
                           4.- Unir listas
                           5.- Salir
                           """);
            int op = scanner.nextInt();
            switch (op) {
                case 1:
                    int dato = 0,
                     dato2;
                    for (int i = 0; i < 10; i++) {
                        dato = randomNumber();
                        dato2 = randomNumber();
                        lista.crear(dato);
                        lista2.crear(dato2);
                    }
                    break;

                case 2:
                    System.out.println("Inicio del borrado");
                    int rango1 = scanner.nextInt();
                    System.out.println("Final del borrado");
                    int rango2 = scanner.nextInt();
                    lista.eliminarRango(rango1, rango2);
                    break;
                case 3:
                    System.out.println("Lista 1: \n" + lista.imprimir());
                    System.out.println("Lista 2: \n" + lista2.imprimir());
                    break;
                case 4:
                    lista3 = lista3.unirListas(lista,lista2);
                    System.out.println(lista3.imprimir());
                    break;
                case 5:
                    exit = true;
                    System.out.println("Saliendo... ");
                    break;
                default:
                    System.out.println("Eleccion equivocada...");
                    break;
            }
        } while (!exit);
    }

}
