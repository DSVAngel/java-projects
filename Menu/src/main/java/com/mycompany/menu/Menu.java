/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.menu;

import java.util.Scanner;

/**
 *
 * @author tonqu
 */
public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int array[] = new int[5]; ///Implementar un cambio de int a String 
        boolean exit = false;
        do {
            System.out.println("""
                               1.- Fill array             |  7.- Print 
                               2.- Enter at the beginning |  8.- Average
                               3.- Introduce at the end   |  9.- Minimum 
                               4.- Delete first           |  10.- Maximum
                               5.- Delete last            |  11.- Pair numbers
                               6.- Search number          |  12.- Exit
                               """);
            int op = scanner.nextInt();
            switch (op) {
                case 1:
                    Operations.fill(array);
                    break;
                case 2:
                    Operations.begin(array);
                    break;
                case 3:
                    Operations.end(array);
                    break;
                case 4:
                    Array.deleteFirstNumber(array);
                    break;
                case 5:
                    Operations.deleteLast(array);
                    break;
                case 6:
                    Operations.searchNumber(array);
                    break;
                case 7:
                    Array.print(array);
                    break;
                case 8:
                    Operations.average(array);
                    break;
                case 9:
                    Array.minimum(array);
                    break;
                case 10:
                    Array.maximum(array);
                    break;
                case 11:
                    Array.pairNumbers(array);
                    break;
                case 12:
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
