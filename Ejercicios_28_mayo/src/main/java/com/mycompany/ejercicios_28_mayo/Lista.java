/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_28_mayo;

import java.util.Random;

/**
 *
 * @author tonqu
 */
public class Lista {

    private Nodo inicio = null;
    private Nodo fin = null;

    public void crear(int dato) {
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setDato(dato);
        if (fin == null) {
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else {
            fin.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(fin);
            fin = nuevoNodo;
        }

    }

    public void eliminarRango(int rango1, int rango2) {
        Nodo ap = inicio;
        while (ap != null) {
            if (ap.getDato() >= rango1 && ap.getDato() <= rango2) {
                if (ap == inicio) {
                    inicio = ap.getSiguiente();
                    if (inicio != null) {
                        inicio.setAnterior(null);
                    }
                } else if (ap == fin) {
                    fin = ap.getAnterior();
                    if (fin != null) {
                        fin.setSiguiente(null);
                    }
                } else {
                    ap.getAnterior().setSiguiente(ap.getSiguiente());
                    ap.getSiguiente().setAnterior(ap.getAnterior());
                }
            }
            ap = ap.getSiguiente();
        }
    }

    public String imprimir() {
        String cad = "";
        Nodo ap;
        ap = inicio;
        while (ap != null) {
            cad = cad + "\n" + ap.getDato();
            ap = ap.getSiguiente();
        }
        return cad;
    }
    
      public Lista unirListas(Lista lista2, Lista lista) {
        Lista listaUnida = new Lista();
        Nodo ap1 = lista.inicio;
        Nodo ap2 = lista2.inicio;
        while (ap1 != null || ap2 != null) {
            if (ap1 != null) {
                listaUnida.crear(ap1.getDato());
                ap1 = ap1.getSiguiente();
            }
            if (ap2 != null) {
                listaUnida.crear(ap2.getDato());
                ap2 = ap2.getSiguiente();
            }
        }
        return listaUnida;
    }
}
