/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.organizamientomezcla;

/**
 *
 * @author tonqu
 */
public class OrganizamientoMezcla {

    public static void main(String[] args) {
       int arr[] ={12,11,13,5,6,7};
        System.out.println("Arreglo dado");
        MetodosOrdenamiento.printArray(arr);
        MetodosOrdenamiento.sort(arr, 0, arr.length-1);
        System.out.println("\nArreglo Ordenado");
        MetodosOrdenamiento.printArray(arr);
    }
}
