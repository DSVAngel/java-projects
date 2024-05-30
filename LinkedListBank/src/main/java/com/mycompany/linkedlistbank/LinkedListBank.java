/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.linkedlistbank;

import java.util.Scanner;

/**
 *
 * @author tonqu
 */
public class LinkedListBank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lista list = new Lista();
        boolean exit = false;
        String x;
        
                
        do {
            Persona persona = new Persona();
            System.out.println("""
                               1.- Form
                               2.- Attend
                               3.- Print
                               4.- Exit
                               """);
            int op = scanner.nextInt();
            scanner.nextLine();
            switch (op) {
                case 1:
                    System.out.println("Enter your name");
                    String name = scanner.nextLine();
                    persona.setName(name);
                    System.out.println("Enter your age");
                    int age = scanner.nextInt();
                    persona.setAge(age);
                    System.out.println("Enter the amout to deposit");
                    double count = scanner.nextDouble();
                    persona.setCount(count);
                    list.agregarFinal(persona);
                    break;
                case 2:
                    System.out.println("Good bye...");
                    list.borrarInicio();
                    break;
                case 3:
                    list.borradoBusqueda("yara");
                    System.out.println(list.imprimir());
                    break;
                case 4:
                    System.out.println("Exit...");
                    exit = true;
                    break;
                default:
                    System.out.println("Try agaim...");
                    break;
            }
        } while (!exit);
    }
}
