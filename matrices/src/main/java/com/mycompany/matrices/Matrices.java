/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.matrices;

import javax.swing.JOptionPane;

/**
 *
 * @author tonqu
 */
public class Matrices {

    public static void main(String[] args) {
        int[][] matriz = {{2, 3, 4, 5}, {1, 2, 3, 4}, {2, 3, 1, 5}, {1, 6, 7, 8}};
        int[] renglones = MetodosMatriz.sumaRenglones(matriz);
        int total = MetodosMatriz.sumaTotal(matriz);
        int diagonal = MetodosMatriz.sumaDiagonal(matriz);
        String titulo = "Matriz";

        StringBuilder matrices = new StringBuilder();
        matrices.append("<html><body>");
        matrices.append("<h2>Suma de los renglones de la matriz </h2>");
        matrices.append("<ol>");
        for (int i = 0; i < matriz.length; i++) {
            matrices.append("<li>").append(renglones[i]).append("</li>");
        }
        matrices.append("</ol>");
        matrices.append("<hr><h2>Suma de la matriz total </h2>");
        matrices.append(total);
        matrices.append("<hr><h2>Suma de la diagonal mayor </h2>");
        matrices.append(diagonal);
        matrices.append("</body></html>");
        JOptionPane.showMessageDialog(null, matrices, titulo, JOptionPane.INFORMATION_MESSAGE);




//    for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz.length; j++) {
//                if (i==1 && j==0) {
//                    
//                }
//            }
//            System.out.println("");
//        }
    }
}
