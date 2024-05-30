package com.mycompany.matrices;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tonqu
 */
public class MetodosMatriz {

    public static int[] sumaRenglones(int[][]matriz) {
        int[] renglones = new int [matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
               renglones[i] += matriz[i][j];
            }
        }
        for (int i = 0; i < renglones.length; i++) {
//            System.out.println("Renglon "+ i+": "+renglones[i]);
        }
        return renglones;
    }

    
    public static int sumaTotal(int[][]matriz) {
        int total =0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                total += matriz[i][j];
            }
        }
        //System.out.println("El total es: "+total);
        return total;
    }

    public static int sumaDiagonal(int[][]matriz) {
        int diagonal = 0;
        for (int i = 0; i < matriz.length; i++) {
           diagonal += matriz[i][i];
        }
        //System.out.println("La diagonal total es: "+ diagonal);
        return diagonal;
    }
}
