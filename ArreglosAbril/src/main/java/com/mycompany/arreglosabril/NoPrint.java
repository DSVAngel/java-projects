/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arreglosabril;

import java.text.DecimalFormat;

/**
 *
 * @author tonqu
 */
class NoPrint {

    DecimalFormat df = new DecimalFormat("#0.00");

    public String mostrarTiendas(int[][][] arreglo, String[] tiendas) {
        StringBuilder sb = new StringBuilder();
        int total = 0;
        int j, k;
        for (int i = 0; i < arreglo.length; i++) {
            for (j = 0; j < arreglo.length; j++) {
                for (k = 0; k < arreglo.length; k++) {
                    total += arreglo[i][j][k];
                }
            }
            sb.append("\n Total de la tienda ").append(tiendas[i]).append(" es: ").append(total);
            total = 0;
        }
        return sb.toString();
    }

    public String mostrarTiendasAños(int[][][] arreglo, String[] tiendas) {
        StringBuilder sb = new StringBuilder();
        String[] año = {"2021", "2022", "2023"};
        int total = 0;
        int ii, j, k;
        for (int i = 0; i < arreglo.length; i++) {
            for (j = 0; j < arreglo.length; j++) {
                for (k = 0; k < arreglo.length; k++) {
                    total += arreglo[i][j][k];
                }
                sb.append("\n Total de la tienda ").append(tiendas[i]).append(" del año ").append(año[j]).append(" es: ").append(total);
                total = 0;
            }

        }
        return sb.toString();
    }

    public String mostrarTiendasAñosProduc(int[][][] arreglo, String[] tiendas, String[] año) {
        StringBuilder sb = new StringBuilder();
        int total = 0;
        int j, k = 0;
        for (int i = 0; i < arreglo.length; i++) {
            for (j = 0; j < arreglo.length; j++) {
                for (k = 0; k < arreglo.length; k++) {
                    total += arreglo[i][j][k];
                    int producto = k + 1;
                    sb.append("\n Total de la tienda ").append(tiendas[i]).append(" del año ").append(año[j]).append(" y del producto ").append(producto).append(" es: ").append(total);
                    total = 0;
                }
            }
        }
        return sb.toString();
    }

    public String promedioTiendas(int[][][] arreglo) {
        StringBuilder sb = new StringBuilder();
        String[] tiendas = {"Norte", "Centro", "Sur"};
        float total = 0;
        float multi = arreglo[1].length * arreglo[2].length;
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length; j++) {
                for (int k = 0; k < arreglo.length; k++) {
                    total += arreglo[i][j][k];
                }
            }
            float prom = total / multi;
            sb.append("\n Promedio de ventas de la tienda ").append(tiendas[i]).append(" es ").append(df.format(prom));
            total = 0;
        }
        return sb.toString();
    }

    public String promedioTiendasAño(int[][][] arreglo) {
        StringBuilder sb = new StringBuilder();
        String[] tiendas = {"Norte", "Centro", "Sur"};
        String[] año = {"2021", "2022", "2023"};
        int total = 0;
        int j, k;
        float multi = arreglo[1].length * arreglo[2].length;

        for (int i = 0; i < arreglo.length; i++) {
            for (j = 0; j < arreglo.length; j++) {
                for (k = 0; k < arreglo.length; k++) {
                    total += arreglo[i][j][k];
                }
                float prom = total / multi;
                sb.append("\n Promedio de ventas de la tienda ").append(tiendas[i]).append(" del año ").append(año[j]).append(" es ").append(df.format(prom));
                total = 0;
            }

        }
        return sb.toString();
    }

    public String ventasConsorcio(int[][][] arreglo) {
        String[] tiendas = {"Norte", "Centro", "Sur"};
        String[] año = {"2021", "2022", "2023"};
        StringBuilder sb = new StringBuilder();
        int total = 0;
        int j, k = 0;
        for (int i = 0; i < arreglo.length; i++) {
            for (j = 0; j < arreglo.length; j++) {
                for (k = 0; k < arreglo.length; k++) {
                    total += arreglo[i][j][k];
                }
            }
        }
        sb.append("Total de ventas del consorcio: " + total);
        return sb.toString();
    }

    public String tiendaVentas(int[][][] arreglo) {
        StringBuilder sb = new StringBuilder();
        String[] tiendas = {"Norte", "Centro", "Sur"};
        int guardar = 0;
        int[] totales = new int[arreglo.length];
        int total = 0;
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length; j++) {
                for (int k = 0; k < arreglo.length; k++) {
                    total += arreglo[i][j][k];
                }
            }
            totales[i] = total;
            total = 0;
        }
        for (int i = 1; i < arreglo.length; i++) {
            if (totales[i] > totales[i - 1]) {
                guardar = i;
            }
        }
        sb.append("\n La tienda con mayor venta fue ").append(tiendas[guardar]).append(" con: ").append(totales[guardar]);
        return sb.toString();
    }

    public String productoEstrella(int[][][] arreglo) {
        StringBuilder sb = new StringBuilder();
        String[] tiendas = {"Norte", "Centro", "Sur"};
        int n1, contador = 0;
        int[] estrellas = new int[arreglo[0].length*arreglo[1].length];
        for (int i = 0; i < arreglo[0].length; i++) {
            for (int j = 0; j < arreglo[2].length; j++) {
                for (int k = 0; k < arreglo[1].length; k++) {
                    estrellas[contador] += arreglo[i][k][j];
                }
                contador++;
            }
        }
        for (int i = 0; i < estrellas.length; i++) {
            sb.append(estrellas[i]+"  ");
        }

        return sb.toString();
    }

    public String sumaTotal(int[][][] arreglo) {
        StringBuilder sb = new StringBuilder();
        int total = 0;
        int j, k;
        for (int i = 0; i < arreglo.length; i++) {
            for (j = 0; j < arreglo.length; j++) {
                for (k = 0; k < arreglo.length; k++) {
                    total += arreglo[i][j][k];
                }
            }
        }
        sb.append("\n Las ventas por producto por todos los años es ").append(total);

        return sb.toString();
    }

}
