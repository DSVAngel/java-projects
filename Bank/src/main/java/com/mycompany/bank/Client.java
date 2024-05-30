/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bank;

import java.util.Iterator;

/**
 *
 * @author tonqu
 */
public class Client {
    private int id;
    private String name;
    private byte age;
    private float balance;

    public Client(String name, byte age, float balance) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Client(String name, byte age) {
        this.name = name;
        this.age = age;
    }

    public Client() {
        this.balance = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    
    
}
