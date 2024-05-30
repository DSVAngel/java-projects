/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colaprioritaria;

/**
 *
 * @author tonqu
 */
public class Metodos {

    private Nodo inicio = null;
    private Nodo fin = null;

    public void agregarFinal(Cliente dato) {
        Nodo nuevoNodo = new Nodo();
        Nodo ap = inicio;
        nuevoNodo.setCliente(dato);
        if (fin == null) {
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else {
            while (ap.getAnterior() != null) {
                fin.setSiguiente(nuevoNodo);
                nuevoNodo.setAnterior(fin);
                fin = nuevoNodo;
            }
        }
    }

    public String imprimir() {
        String cad = "";
        Nodo ap;
        ap = inicio;
        while (ap != null) {
            cad = cad + "\n" + ap.getCliente().getNombre() + "\n" + ap.getCliente().getPrioridad() + "\n" + ap.getCliente().getTurno();
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

    public String posicion(Cliente cliente) {
        Nodo ap = inicio;
        String salida = "";
        int i = 0;
        while (ap != null) {
            if (ap.getCliente().equals(cliente)) {
                salida = "" + i;
            }
            ap = ap.getSiguiente();
            i++;
        }
        return salida;
    }

    public void borradoBusqueda(Cliente cliente) {
        Nodo ap = inicio;
        if (inicio != null) {
            if (ap.getCliente().equals(cliente)) {
                borrarInicio();
            } else {
                while (ap != null) {
                    Nodo aux = ap.getSiguiente();
                    if (aux != null) {
                        if (aux.getCliente().equals(cliente)) {
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
