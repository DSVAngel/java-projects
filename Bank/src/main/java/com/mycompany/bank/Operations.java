/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author tonqu
 */
public class Operations {
    
    List<Client> clients = new ArrayList<>();
    Client client = new Client();
    Scanner letter = new Scanner(System.in);
    Client[] array = new Client[2];

    public void insert(Client client) {
        int i = 0;
        while (i < array.length) {
            if (array[i] == null) {
                client.setId(i + 1);
                array[i] = client;
                i = array.length + 1;
            }
            i++;
        }
    }
    
    public List<Client> modify(int id, String name, byte age){
         for (Client clients : array) {
             if (clients.getId()== id) {
                 clients.setName(name);
                 clients.setAge(age);
             }
        }
         return clients;
    }

    public List<Client> getAllClients() {
        for (Client client : array) {
            if (client != null) {
                clients.add(client);
                System.out.println("Client ID: " + client.getId()
                        + ", Name: " + client.getName()
                        + ", Age: " + client.getAge()
                        + ", Balance: " + client.getBalance());
            }
        }
        return clients;
    }

    public List<Client> deposits(int op, float amount) {
        for (Client client : array) {
            if (client != null && client.getId() == op) {
                float totalAmount = client.getBalance();
                totalAmount = totalAmount + amount;
                client.setBalance(totalAmount);

            }

        }
        return clients;
    }

    public List<Client> withdraws(int op, float amount) {
        for (Client client : array) {
            if (client != null && client.getId() == op) {
                float totalToWithdraw = client.getBalance();
                if (totalToWithdraw > amount) {
                    totalToWithdraw = totalToWithdraw - amount;
                    client.setBalance(totalToWithdraw);
                } else {
                    System.out.println("Insufficient balances...");
                }
            }
        }
        return clients;
    }
    
    public List<Client> empty(int op) {
        for (Client client : array) {
            if (client != null && client.getId() == op) {
                float totalToWithdraw = client.getBalance();
                totalToWithdraw = 0;
                client.setBalance(totalToWithdraw);
            }
        }
        return clients;
    }
}
