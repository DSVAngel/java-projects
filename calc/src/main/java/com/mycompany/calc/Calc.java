/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.calc;

import java.util.Scanner;

/**
 *
 * @author tonqu
 */
public class Calc {

    private static int calcular(int n, int a, int b, int c) {
        if (n == 3) {
            c = a + b;
            return c;
        } else {
            c = a + b;
            a = b;
            b = c;
        }
        return calcular(n - 1, a, b, c);
    }

    public static int calculo() {
        int a, b, c = 0, meses = 0;
        a = 1;
        b = 1;
        for (int i = 2; c <= 300; i++) {
            c = a + b;
            a = b;
            b = c;
          meses = i;
        
        }
        return meses;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 1, b = 1, n, c = 0;
        System.out.println("Ingresa la cantidad de meses: ");
        n = scanner.nextInt();
        int calcular = calcular(n, a, b, c);
        int calculo = calculo();
        System.out.println(calcular);
        System.out.println(calculo);
    }

}
