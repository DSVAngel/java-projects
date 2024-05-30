/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.practica3;

/**
 *
 * @author tonqu
 */
public class Practica3 {

    public static void main(String[] args) {
        int[] lista1 = {1, 3, 2, 5, 4};
        quicksort(lista1, 0, 4);
        for (int i = 0; i < lista1.length; i++) {
            System.out.println(lista1[i]);
        }
//        int[] array = {7, 10, 9, 8, 3, 1, 2, 11, 1, 5};
//        for (int i = 0; i < array.length/2; i++) {
//            int aux = array[i];
//            array[i] = array[array.length - 1 - i];
//            array[array.length - 1 - i] = aux;
//            System.out.println(array[i]);
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length - 1; j++) {
//                if (array[j] > array[j + 1]) {
//                    int temp = array[j + 1];
//                    array[j + 1] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = 0; j < array.length; j++) {
//                if (array[i] > array[j]) {
//                    int variableaux = array[i];
//                    array[i] = array[j];
//                    array[j] = variableaux;
//                }
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }

    }

    public static void quicksort(int lista1[], int izq, int der) {
        int i = izq;
        int j = der;
        int pivote = lista1[(i + j) / 2];
        do {
            while (lista1[i] < pivote) {
                i++;
            }
            while (lista1[j] > pivote) {
                j--;
            }
            if (i <= j) {
                int aux = lista1[i];
                lista1[i] = lista1[j];
                lista1[j] = aux;
                i++;
                j--;
            }
        } while (i<=j);
        if (izq <j) {
            quicksort(lista1,izq,j);
        }
        if (i<der) {
            quicksort(lista1,i,der);
        }
    }
}
