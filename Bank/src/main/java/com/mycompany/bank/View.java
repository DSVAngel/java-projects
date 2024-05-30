/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bank;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author tonqu
 */
public class View {

    private Operations operations;
    private Scanner scanner;

    public View() {
        this.operations = new Operations();
        this.scanner = new Scanner(System.in);
    }

    public void add() {
        System.out.println("Enter your name");
        String name = scanner.nextLine();

        System.out.println("Enter your age");
        byte age = scanner.nextByte();

        Client client = new Client(name, age);
        operations.insert(client);
        scanner.nextLine();

    }

    public void modify() {
        System.out.println("Account to modify");
        int id = scanner.nextByte();
        scanner.nextLine();
        System.out.println("Enter new name");
        String name = scanner.nextLine();
        System.out.println("Enter new age");
        byte age = scanner.nextByte();
        
        List<Client> clients = operations.modify(id, name, age);
        scanner.nextLine();
    }

    public void show() {
        List<Client> clients = operations.getAllClients();

    }

    public void deposit() {
        System.out.println("Account to deposit");
        int op = scanner.nextInt();
        System.out.println("Amount to deposit");
        float amount = scanner.nextFloat();
        List<Client> clients = operations.deposits(op, amount);
        scanner.nextLine();

    }

    public void withdraw() {
        System.out.println("Account to withdraw");
        int op = scanner.nextInt();
        System.out.println("Amount to withdraw");
        float amount = scanner.nextFloat();
        List<Client> clients = operations.withdraws(op, amount);
        scanner.nextLine();
    }
    
    public void emptyCount(){
    System.out.println("Account to empty");
        int op = scanner.nextInt();
        List<Client> clients = operations.empty(op);
        scanner.nextLine();
    }
}

    
