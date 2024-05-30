/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaligada;

/**
 *
 * @author tonqu
 */
public class Lista {

    private Nodo inicio = null;
    private Nodo fin = null;

    public void agregarInicio(String dato) {
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setDato(dato);
        if (inicio == null) {
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(inicio);
            inicio.setAnterior(nuevoNodo);
            inicio = nuevoNodo;
        }
    }

    public void agregarFinal(String dato) {
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

    public String imprimir() {
        String cad = "";
        Nodo ap;
        ap = inicio;
        while (ap != null) {
            cad = cad + "\n" + ap.getDato() + "\n" + ap.getAnterior() + "\n" + ap.getSiguiente();
            ap = ap.getSiguiente();
        }
        System.out.println(inicio);
        System.out.println(fin);
        return cad;
    }

    public void borrarInicio() {
        if (inicio != null) {
            Nodo ap = inicio;
            ap = ap.getSiguiente();
            inicio = ap;
            ap.setAnterior(null);
        }
    }

    public void borrarFinal() {
        if (inicio != null) {
            Nodo ap = inicio;
            while (ap.getSiguiente().getSiguiente() != null) {
                ap = ap.getSiguiente();
            }
            ap.setSiguiente(null);
            fin = ap;
        }
    }

    public String posicion(String dato) {
        Nodo ap = inicio;
        String salida = "";
        int i = 0;
        while (ap != null) {
            if (ap.getDato().equals(dato)) {
                salida = "" + i;
            }
            ap = ap.getSiguiente();
            i++;
        }
        return salida;
    }

    public void borradoBusqueda(String dato) {
        Nodo ap = inicio;
        if (inicio != null) {
            if (ap.getDato().equals(dato)) {
                borrarInicio();
            } else {
                while (ap != null) {
                    Nodo aux = ap.getSiguiente();
                    if (aux != null) {
                        if (aux.getDato().equals(dato)) {
                            ap.setSiguiente(aux.getSiguiente());
                            if (aux.getSiguiente() == null) {
                                fin = ap;
                            } else {
                                aux.getSiguiente().setAnterior(ap);
                            }
                        }
                    }
                    ap = ap.getSiguiente();
                }
            }
        }
    }

}
