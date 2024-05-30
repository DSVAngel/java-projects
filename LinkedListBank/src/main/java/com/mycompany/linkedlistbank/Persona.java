/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.linkedlistbank;

/**
 *
 * @author tonqu
 */
public class Persona {

    private String name;
    private int age;
    private double count;

    public Persona() {
    }

    public Persona(String name, int age, double count) {
        this.name = name;
        this.age = age;
        this.count = count;
    }

    public Persona(double count) {
        this.count = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getCount() {
        return count;
    }

    public void setCount(double count) {
        this.count = count;
    }

}
