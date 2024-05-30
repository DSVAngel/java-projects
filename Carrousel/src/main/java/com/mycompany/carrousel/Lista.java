/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carrousel;

/**
 *
 * @author tonqu
 */
public class Lista {

    private Nodo inicio = null;
    private Nodo fin = null;

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

    public int verificar(String nombre) {
        int regresar = 0;
        boolean validar2 = cicloBusqueda(nombre);
        if (validar2) {
            regresar = 1;
        } else {
            regresar = 2;
        }
        return regresar;
    }

    public boolean cicloBusqueda(String dato) {
        boolean regresar = true;
        Nodo ap = inicio;
        int i = 0;
        while (ap != null) {
            if (ap.getDato().equals(dato)) {
                regresar = false;
            }
            ap = ap.getSiguiente();
            i++;
        }
        return regresar;
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
