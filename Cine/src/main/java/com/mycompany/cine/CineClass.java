/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cine;

import java.util.Random;

/**
 *
 * @author tonqu
 */
public class CineClass {

    Peliculas p = new Peliculas();
    int contador2 = 0;
    Espectador[][] sala = new Espectador[6][7];

    public void peliculas() {
        p.setDirector("Guillermo");
        p.setDuracion(190);
        p.setEdadminima(12);
        p.setTitulo("Pinocchio");
    }

    public String posicion(Espectador dato, int edad) {
        Random random = new Random();
        String cad = "";
        int renglones = random.nextInt(6);
        int columnas = random.nextInt(7);
        int resul = verificar(renglones, columnas, edad);
        char c = 'A';
        c += columnas;
        if (c > 'A') {
            c--;
        }
        switch (resul) {
            case 0:
                sala[renglones][columnas] = dato;
                cad = "Asiento asignado, Seccion: " + renglones + " Fila: " + c;
                break;
            case 1:
                cad = "No cumple con la edad para ver la pelicula";
                break;
            case 2:
                cad = "Asiento ocupado";
                break;
        }
        return cad;
    }

    public int verificar(int renglones, int columnas, int edad) {
        int verificar = 0;
        if (edad < p.getEdadminima()) {
            verificar = 1;
        }
        if (sala[renglones][columnas] != null) {
            verificar = 2;
        }
        return verificar;
    }

    public String asientosVendidos() {
        String cad = "";
        int contador = 0;
        
        int total = sala[0].length * sala[1].length;
        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[1].length; j++) {
                if (sala[i][j] != null) {
                    contador++;
                    if (sala[i][j].getEdad() >= 60) {
                    contador2++;
                }
                }
                
            }
        }
        total -= contador;
        cad = "Total de asientos vendidos es de: " + contador + " Los asientos vacios fueron: " + total + "\nLas personas mayores a 60 fueron: " + contador2;
        return cad;
    }
}
