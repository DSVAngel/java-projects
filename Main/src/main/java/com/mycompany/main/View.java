/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import java.util.Scanner;

/**
 *
 * @author tonqu
 */
public class View {
    Operations oper = new Operations();
    Scanner scanner = new Scanner(System.in);
    int op;

    public void newfloor() {
        System.out.println("New floor width");
        double newwidth = scanner.nextDouble();
        System.out.println("New floor length");
        double newlength = scanner.nextDouble();
        oper.setNewFloorDimensions(newwidth, newlength);
    }

    public void rugssize() {
        System.out.println("Rug width");
        double rugwidth = scanner.nextDouble();
        System.out.println("Rug length");
        double ruglength = scanner.nextDouble();
        oper.setRugDimensions(rugwidth, ruglength);
    }


    public void area() {
        System.out.println("""
                           What area do you want to obtain?
                           1.- Floor
                           2.- Rug
                           """);
        op = scanner.nextInt();
        oper.calculateArea(op);
    }

    public void perimeter() {
        System.out.println("""
                           What perimeter do you want to obtain?
                           1.- Floor
                           2.- Rug
                           """);
        op = scanner.nextInt();
        oper.calculatePerimeter(op);
    }

    public void compare() {
      
        System.out.println("""
                           What do you want to compare?
                           1.- Area
                           2.- Perimeter
                           """);
        op = scanner.nextInt();
        oper.compareSizes(op);
    }
}
