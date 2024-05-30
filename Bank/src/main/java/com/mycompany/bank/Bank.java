/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bank;

import java.util.Scanner;

/**
 *
 */
public class Bank {

    public static void main(String[] args) {
        Scanner letter = new Scanner(System.in);
        View view = new View();
        boolean exit = false;
        do {
            System.out.println("""
                               1.- Add client
                               2.- Modify client
                               3.- Deposit
                               4.- Withdraw
                               5.- Empty count
                               6.- Print
                               7.- Exit
                               """);
            byte op = letter.nextByte();
            switch (op) {
                case 1:
                    view.add();
                    break;
                case 2:
                    view.modify();
                    break;
                case 3:
                    view.deposit();
                    break;
                case 4:
                    view.withdraw();
                    break;
                case 5:
                    view.emptyCount();
                    break;
                case 6:
                    view.show();
                    break;
                case 7:
                    exit = true;
                    System.out.println("Exit...");
                    break;
                default:
                    System.out.println("Try again..");
                    break;
            }
        } while (!exit);

    }
}
