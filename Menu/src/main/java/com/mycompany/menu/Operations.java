package com.mycompany.menu;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Operations {

    private static Scanner scanner = new Scanner(System.in); //Necesidad del "final"?
    private static int position = 0;

    public static void fill(int array[]) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                String showInputDialog = JOptionPane.showInputDialog(null, "Enter a number");
                int number = Integer.parseInt(showInputDialog);
                boolean search = Array.search(number, array);
                if (search == false) {
                    array[i] = number;
                } else {
                    i = i - 1;
                }
            }
        }
    }

    public static void begin(int array[]) {
        boolean full = Array.assess(array);
        if (full == false) {
            String showInputDialog = JOptionPane.showInputDialog(null, "Enter a number");
            int number = Integer.parseInt(showInputDialog);
            boolean search = Array.search(number, array);
            if (search == false) {
                Array.insertAtBegin(number, array);
                position += 1;
            }
        } else {
            JOptionPane.showMessageDialog(null, "There is no space left");
//            System.out.println("There is no space left ");
        }
    }

    public static void end(int array[]) {
        boolean full = Array.assess(array);
        if (full == false) {
            String showInputDialog = JOptionPane.showInputDialog(null, "Enter a number");
            int number = Integer.parseInt(showInputDialog);
//            System.out.println("Number to enter: ");
//            int number = scanner.nextInt();
            boolean search = Array.search(number, array);
            if (search == false) {
                Array.insertAtEnd(number, array, position);
                position += 1;
            }
        } else {
            JOptionPane.showMessageDialog(null, "There is no space left");
//            System.out.println("There is no space left ");
        }
    }

    public static void deleteLast(int array[]) {
        position -= 1;
        Array.deleteLastNumber(array);
    }

    public static void searchNumber(int[] array) {
        String showInputDialog = JOptionPane.showInputDialog(null, "Number to search");
        int number = Integer.parseInt(showInputDialog);
//        System.out.println("Number to search: ");
//        int number = scanner.nextInt();
        boolean successSearch = Array.search(number, array);
        if (successSearch == false) {
            JOptionPane.showMessageDialog(null, "Number not found");
//            System.out.println("Number not found");
        }

    }

    public static void average(int[] array) {
        float average = 0;
        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }
        average /= position;
        JOptionPane.showMessageDialog(null, "The average is: " + average);
//        System.out.println("The average is: " + average);
    }

}
