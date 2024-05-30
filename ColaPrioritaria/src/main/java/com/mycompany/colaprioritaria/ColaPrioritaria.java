/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.colaprioritaria;

import java.util.Scanner;

/**
 *
 * @author tonqu
 */
public class ColaPrioritaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Metodos metodo = new Metodos();
        Cliente cliente = new Cliente();
        boolean exit = false;
        do {

            System.out.println("""
                           1.- Ingresar cliente
                           2.- Sacar cliente
                           3.- Salir
                           """);
            int op = scanner.nextInt();
            scanner.nextLine();
            switch (op) {
                case 1:
                    System.out.println("Escribe el nombre");
                    cliente.setNombre(scanner.nextLine());
                    System.out.println("Escribe la prioridad");
                    cliente.setPrioridad(scanner.nextInt());
                    System.out.println("Escribe el turno");
                    cliente.setTurno(scanner.nextInt());
                    metodo.agregarFinal(cliente);
                    System.out.println(metodo.imprimir());
                    break;
                case 2:
                    break;
                case 3:
                    exit = true;
                    System.out.println("Saliento");
                    break;

            }
        } while (!exit);
    }
}
