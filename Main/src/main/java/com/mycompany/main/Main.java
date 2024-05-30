/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.main;

import java.util.Scanner;

/**
 *
 * @author tonqu
 */
public class Main {

    
    public static void main(String[] args) {
        View view = new View();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        do {
            System.out.println("""
                           1.- New floor size
                           2.- Rugs size
                           3.- Area
                           4.- Perimeter
                           5.- Compare size
                           6.- Exit    
                           """);
            int op = scanner.nextInt();
            switch (op) {
                case 1:
                    view.newfloor();
                    break;
                case 2:
                    view.rugssize();
                    break;
                case 3:
                    view.area();
                    break;
                case 4:
                    view.perimeter();
                    break;
                case 5:
                    view.compare();
                    break;
                case 6:
                    exit = true;
                    System.out.println("Exit...");
                    break;
                default:
                    System.out.println("Try again...");
                    break;

            }
        } while (!exit);
    }
}
