/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 
package com.mycompany.menu;

import javax.swing.JOptionPane;

/**
 *
 * @author tonqu
 */
public class Array {

    public static boolean assess(int array[]) {
        boolean full = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                full = false;
            }
        }
        return full;
    }//Checar si es necesario otro para verificar que este vacio

    public static boolean search(int number, int array[]) {
        boolean successSearch = false;
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                JOptionPane.showMessageDialog(null, "Number already placed in: "+ i+1);
//                System.out.println("Number already placed in: " + i);
                successSearch = true;
            }
        }
        return successSearch;
    }

    public static void insertAtBegin(int number, int array[]) {
        int change[] = new int[array.length];
        for (int i = 0; i < array.length - 1; i++) {
            change[i + 1] = array[i];
            array[i] = change[i];
        }
        array[0] = number;
//        int change[] = new int[array.length];
//        if (array[0] == 0) {
//            array[0] = number;
//        } else if (array[array.length - 1] == 0) {
//            System.arraycopy(array, 0, change, 0, array.length);
//            array[0] = number;
//            System.arraycopy(change, 0, array, 1, array.length - 1);
//        } else {
//            System.arraycopy(array, 0, change, 0, array.length);
//            array[0] = number;
//            System.arraycopy(change, 0, array, 1, array.length - array.length / 2);
//        }

    }

    public static void insertAtEnd(int number, int array[], int position) {
        array[position] = number;
    }

    public static void deleteFirstNumber(int array[]) {
        int i;
        int change[] = new int[array.length];
        for (i = 0; i < array.length - 1; i++) {
            change[i] = array[i + 1];
            array[i] = change[i];
        }
        array[i] = 0;
//        System.arraycopy(array, 1, change, 0, array.length - 1);
//        System.arraycopy(change, 0, array, 0, change.length);
    }

    public static void deleteLastNumber(int array[]) {
        array[array.length] = 0;
    }
    
    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            JOptionPane.showMessageDialog(null, i+1 + ".-"+array[i]);
//            System.out.println(i + 1 + ".- " + array[i]);//Queda en duda cambiar su estilo
        }
    }

    public static void minimum(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void maximum(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] < array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void pairNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                JOptionPane.showMessageDialog(null, array[i]);
//                System.out.println(array[i]);
            }
        }
    }
}
