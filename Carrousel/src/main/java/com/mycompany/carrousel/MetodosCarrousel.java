/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrousel;

import javax.swing.DefaultListModel;

/**
 *
 * @author tonqu
 */
public class MetodosCarrousel {

    public static void agregar(String[] nombres, String agregar, int conta) {
        int n = nombres.length;
        nombres[conta] = agregar;
    }

    public static int verificar(String nombre, String[] nombres) {
        int regresar = 0;
        //boolean validar1 = validar(nombre);
        boolean validar2 = cicloBusqueda(nombres, nombre);
        if (validar2) {
            regresar = 1;
        } else {
            regresar = 2;
        }

        return regresar;
    }

    public static boolean cicloBusqueda(String[] nombres, String nombre) {
        boolean regresar = true;
        for (int i = 0; i < nombres.length - 1; i++) {
            if (nombre.equals(nombres[i])) {
                regresar = false;
            }
        }
        return regresar;
    }

    public static void borrar(String[] nombres, String nombre, int conta) {
        String[] L = new String[conta * 2];
        int nuevaLongitud = 0;

        // Copiar los elementos de nombres a L, omitiendo el nombre que queremos eliminar
        for (int i = 0; i < conta; i++) {
            if (!nombre.equals(nombres[i])) {
                L[nuevaLongitud] = nombres[i];
                nuevaLongitud++;
            }
        }

        // Copiar los elementos de L de nuevo a nombres
        for (int i = 0; i < nuevaLongitud; i++) {
            nombres[i] = L[i];
            System.out.println(i + ".-" + nombres[i]);
        }
    }

//    public static void borrar(String[] nombres, String nombre, int conta) {
//        String[] L = new String[conta * 2];
//        for (int i = 0; i < conta-1; i++) {
//            if (nombre.equals(nombres[i])) {
//                for (int j = 0; j < i; j++) {
//                    L[j] = nombres[j];
//                }
//                for (int j = i; j < conta-1; j++) {
//                    L[j] = nombres[j+1];
//                    System.out.println(L[j]);
//                }
//            }
//        }
//        for (int i = 0; i < conta - 1; i++) {
//            nombres[i] = L[i];
//            System.out.println(i + ".-" + nombres[i]);
//        }
//
//    }
    /* public static boolean validar(String nombre) {
        return nombre.matches("[A-Za-z0-9]+");
    }*/
}
