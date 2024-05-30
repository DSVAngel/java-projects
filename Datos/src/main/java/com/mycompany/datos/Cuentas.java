/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datos;

import javax.swing.JOptionPane;

/**
 *
 * @author tonqu
 */
public class Cuentas {

    /*
    Buscar
    Sumar
    Mayor 
     */
    public boolean buscarPalabra(String[] articulos, String retener) {
        boolean logica = false;
        for (int i = 0; i < articulos.length; i++) {
            if (retener == articulos[i]) {
                logica = true;
            }
        }
        return logica;

    }

    public int buscarNumero(String[] articulos, String retener) {
        boolean logica;
        int posi = 0;
        logica = buscarPalabra(articulos, retener);
        if (logica == true) {
            for (int i = 0; i < articulos.length; i++) {
                if (retener == articulos[i]) {
                    posi = i;
                }
            }
        }
        return posi;
    }

    public double sumar(double[] total) {
        int importe = 0;
        for (int i = 0; i < total.length - 1; i++) {
            importe += total[i];
        }
        return importe;
    }

    public String[] mayor(String[] articulos, double[] cantidad) {
        String aux;
        for (int i = 0; i < articulos.length; i++) {
            for (int j = i+1; j < articulos.length; j++) {
                if (cantidad[j] > cantidad[i]) {
                    aux = articulos[i];
                    articulos[i] = articulos[j];
                    articulos[j] = aux;
                }
            }
        }
        return articulos;
    }
    public double[] ordenar(double[] total){
        double aux;
        for (int i = 0; i < total.length; i++) {
            for (int j = i+1; j <total.length; j++) {
                if (total[j] > total[i]) {
                    aux = total[i];
                    total[i] = total[j];
                    total[j] = aux;
                }
            }
        }
        return total;
    }

    public double[] porcentajeProducto(double[] total) {
        double importe = sumar(total);
        double[] regreso = new double[total.length];
        double[] porcentajeOrdenado = new double[total.length];
        for (int i = 0; i < total.length; i++) {
            regreso[i] = (total[i] * 100) / importe;
        }
        porcentajeOrdenado = ordenar(regreso);
        
        return porcentajeOrdenado;
    }

    public double[] subtotalProducto(double[] cantidad, double[] precios) {
        double[] subtotal = new double[cantidad.length];
        double[] subtotalOrdenado = new double[cantidad.length];
        for (int i = 0; i < cantidad.length; i++) {
            subtotal[i] = cantidad[i]*precios[i];
        }
        subtotalOrdenado = ordenar(subtotal);
        return subtotalOrdenado;
    }
}
