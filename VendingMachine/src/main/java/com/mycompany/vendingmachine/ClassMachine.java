/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vendingmachine;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author tonqu
 */
public class ClassMachine {

    private static Scanner scanner = new Scanner(System.in);

    //Principal code
    public static double requestCandy(String[][] CandyNames, double[][] price, int[][] quantity, double total) {
        System.out.println("Enter the code:  ");
        String code = scanner.nextLine();
        boolean verify = verifyCandy(quantity, code);
        if (verify) {
            int[] coords = coordsXY(quantity, code);
            System.out.println("ITEM");
            System.out.println("Name: " + CandyNames[coords[0]][coords[1]] + " \nPrice: " + price[coords[0]][coords[1]] + " $ ");
            quantity[coords[0]][coords[1]] -= 1;
            total += price[coords[0]][coords[1]];
        } else {
            System.out.println("There are no sweets left in stock. ");
        }
        return total;
    }

    public static void showCandy(String[][] CandyNames, double[][] price, int[][] quantity) {
        for (int i = 0; i < price.length; i++) {
            for (int j = 0; j < price.length; j++) {
                System.out.println("Name: " + CandyNames[i][j] + " \nPrice: " + price[i][j] + "$ " + "\nCode: " + i + "" + j);
            }
        }
    }

    public static void fillMachine(String[][] CandyNames, double[][] price, int[][] quantity) {
        int candy;
        String pass = "Maquina2024", code;
        System.out.println("Enter the password: ");
        String op = scanner.nextLine();
        if (op.equals(pass)) {
            for (int i = 0; i < price.length; i++) {
                for (int j = 0; j < price.length; j++) {
                    System.out.println("Name: " + CandyNames[i][j] + " \nPrice: " + price[i][j] + "$ " + "\nCode: " + i + "" + j + "\nQuantity: " + quantity[i][j]);
                }
            }
            System.out.println("Please enter the sweet code to fill out: ");
            code = scanner.nextLine();
            int[] coords = coordsXY(quantity, code);
            System.out.println("How many sweets will be added?How many sweets will be added? ");
            candy = scanner.nextInt();
            quantity[coords[0]][coords[1]] += candy;
        }
        scanner.nextLine();
    }

    public static void shutdownMachine(double total) {
        System.out.println("The total profit is: ");
        System.out.println(total);
    }

    /*-------------------------------------------------------------------------------------------------------------*/
    //Sub code
    public static boolean verifyCandy(int[][] quantity, String code) {
        boolean check = false;
        if (validateNumber(code)) {
            int[] coords = coordsXY(quantity, code);
            if (quantity[coords[0]][coords[1]] > 0) {
                check = true;
            } else {
                check = false;
            }
        } else {
            System.out.println("Just enter numbers ");
        }
        return check;
    }

    public static int[] stringToInt(String code) {
        char[] list = code.toCharArray();
        int[] numbers = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            numbers[i] = list[i] - '0';
        }
        return numbers;
    }

    public static boolean validateNumber(String code) {
        return code.matches("[0-9]+");
    }

    public static int[] coordsXY(int[][] quantity, String code) {
        int[] coords = new int[2];
        int[] codes = stringToInt(code);
        for (int i = 0; i < quantity.length; i++) {
            for (int j = 0; j < quantity.length; j++) {
                if (codes[0] == i && codes[1] == j) {
                    coords[0] = i;
                    coords[1] = j;
                }
            }
        }
        return coords;
    }
}
