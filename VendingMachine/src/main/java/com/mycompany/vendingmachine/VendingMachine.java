/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.vendingmachine;

import java.util.Scanner;

/**
 *
 * @author tonqu
 */
public class VendingMachine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] CandyNames = {{"KitKat", "Chicles de fresa", "Lacasitos", "Palotes"}, {"Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix"}, {"Kinder Bueno", "M&M'S", "Papa Delta", "Chicles de menta"}, {"Lacasitos", "Crunch", "Milkybar", "KitKat"}};
        double[][] price = {{1.1, 0.8, 1.5, 0.9}, {1.8, 1, 1.2, 1}, {1.8, 1.3, 1.2, 0.8}, {1.5, 1.1, 1.1, 1.1}};
        int[][] quantity = {{5, 5, 5, 5}, {5, 5, 5, 5}, {5, 5, 5, 5}, {5, 5, 5, 5}};
        boolean exit = false;
        double total = 0;
        do {
            System.out.println("""
                           1.- Request candy
                           2.- Show Candy
                           3.- Fill 
                           4.- Shutdown 
                           """);
            int op = scanner.nextInt();
            switch (op) {
                case 1:
                    total = ClassMachine.requestCandy(CandyNames, price, quantity, total);
                    break;
                case 2:
                    ClassMachine.showCandy(CandyNames, price, quantity);
                    break;
                case 3:
                    ClassMachine.fillMachine(CandyNames, price, quantity);
                    break;
                case 4:
                    ClassMachine.shutdownMachine(total);
                    exit = true;
                    break;
                default:
                    System.out.println("Try again ");
                    break;
            }
        } while (!exit);
    }
}
