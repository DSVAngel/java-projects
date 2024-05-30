/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colaprioritaria;

/**
 *
 * @author tonqu
 */
public class Cliente {
    private String nombre;
    private int turno;
    private int prioridad;

    public Cliente(String nombre, int turno, int prioridad) {
        this.nombre = nombre;
        this.turno = turno;
        this.prioridad = prioridad;
    }

    public Cliente() {
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    
    
    
}
