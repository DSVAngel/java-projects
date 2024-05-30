/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arreglosabril;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author tonqu
 */
public class Metodos {

    NoPrint print = new NoPrint();
    Scanner scanner = new Scanner(System.in);

    public void menu() {
        boolean exit = false;

        int[][][] arreglo3 = {
            {
                {1, 2, 3},
                {2, 1, 3},
                {1, 4, 3}
            },
            {
                {5, 4, 3},
                {3, 4, 2},
                {1, 5, 4}
            },
            {
                {2, 1, 0},
                {3, 1, 8},
                {4, 5, 2}
            }
        };
        //array index index
        //index  row  colum

        do {
            System.out.println("");
            System.out.println(""" 
                               1.- Mostrar ventas por tienda, por tienda y por año, por tienda, año y por producto
                               2.- Promedio de ventas por tienda, por tienda y por año y ventas totales del consorcio
                               3.- Tienda que mas ventas tuvo por año
                               4.- Producto estrella por tienda en los últimos años
                               5.- Total de ventas por producto de todas las tiendas en todos los años.
                               6.- Salir
                               """);
            int op = scanner.nextInt();
            switch (op) {
                case 1:
                    mostrarClases(arreglo3);
                    break;
                case 2:
                    promedioClases(arreglo3);
                    break;
                case 3:
                    ventasAño(arreglo3);
                    break;
                case 4:
                    productoMasVendido(arreglo3);
                    break;
                case 5:
                    total(arreglo3);
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Intenta de nuevo");
                    break;
            }
        } while (!exit);

    }

    public void mostrarClases(int[][][] arreglo) {
        String[] tiendas = {"Norte", "Centro", "Sur"};
        String[] año = {"2021", "2022", "2023"};
        String metodo = print.mostrarTiendas(arreglo, tiendas);
        String metodo2 = print.mostrarTiendasAños(arreglo, tiendas);
        String metodo3 = print.mostrarTiendasAñosProduc(arreglo, tiendas, año);
        System.out.println(metodo);
        System.out.println(metodo2);
        System.out.println(metodo3);

    }

    public void promedioClases(int[][][] arreglo) {
        System.out.println("");
        System.out.println(""" 
                           Que deseas ver?
                           1.- Promedio de las tiendas
                           2.- Promedio de los años de cada tienda
                           3.- Cantidad de ventas del consorcio
                           """);
        int op = scanner.nextInt();
        switch (op) {
            case 1:
                String metodo1 = print.promedioTiendas(arreglo);
                System.out.println(metodo1);
                break;
            case 2:
                String metodo2 = print.promedioTiendasAño(arreglo);
                System.out.println(metodo2);
                break;
            case 3:
                String metodo3 = print.ventasConsorcio(arreglo);
                System.out.println(metodo3);
                break;
        }

    }

    public void ventasAño(int[][][] arreglo) {
        String metodo1 = print.tiendaVentas(arreglo);
        System.out.println(metodo1);
    }

    public void productoMasVendido(int[][][] arreglo) {
        String metodo1 = print.productoEstrella(arreglo);
        System.out.println(metodo1);
    }

    public void total(int[][][] arreglo) {
        String metodo = print.sumaTotal(arreglo);
        System.out.println(metodo);
    }
}
