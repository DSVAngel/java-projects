/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject6;

import java.util.Scanner;

/**
 *
 * @author tonqu
 */
public class Mavenproject6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        int opcion;
        do {

            System.out.println("Menú del Banco:");
            System.out.println("1. Depósito");
            System.out.println("2. Retiro");
            System.out.println("3. Consultar Saldo");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double cantidadDeposito = scanner.nextDouble();
                    banco.depositar(cantidadDeposito);
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double cantidadRetiro = scanner.nextDouble();
                    banco.retirar(cantidadRetiro);
                    break;
                case 3:
                    System.out.println("Su saldo actual es: " + banco.consultarSaldo());
                    break;
                case 4:
                    System.out.println("Gracias por usar nuestros servicios. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
                case 5:
                    System.out.println("ingresa tu nombre");
            }
        } while (opcion != 4);

        scanner.close();
    }
}

class Banco {

    private double saldo;

    public Banco() {
        saldo = 0.0;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
        System.out.println("Depósito exitoso.");
    }

    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso.");
        } else {
            System.out.println("Saldo insuficiente para realizar el retiro.");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }
}
