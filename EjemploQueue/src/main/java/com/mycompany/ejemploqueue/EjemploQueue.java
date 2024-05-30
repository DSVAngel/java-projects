/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejemploqueue;

import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author tonqu
 */
public class EjemploQueue {

    public static void main(String[] args) {
        Queue<PartidoFutbol> queue = new LinkedList<PartidoFutbol>();
//        PartidoFutbol pf = new PartidoFutbol("America", "Chivas", 3, 0);
//        queue.add(pf);
//        PartidoFutbol pf2 = new PartidoFutbol("America", "Chivas", 3, 4);
//        queue.add(pf2);
//        PartidoFutbol pf3 = new PartidoFutbol("America", "Chivas", 4, 2);
//        queue.add(pf3);
//        System.out.println("El contenido de la cola: " + queue);

        File fichero = new File("C:\\Users\\tonqu\\Downloads\\partidos.txt");
        Scanner s = null;
        try {
            System.out.println("... Leemos el contenido del fichero");
            s = new Scanner(fichero);
            while (s.hasNextLine()) {
                String linea = s.nextLine();
                String[] cortarString = linea.split("::");
                PartidoFutbol partido = new PartidoFutbol();

                partido.setEquipoLocal(cortarString[0]);
                partido.setEquipoVisitante(cortarString[1]);
                partido.setGolesLocal(Integer.parseInt(cortarString[2]));
                partido.setGolesVisitante(Integer.parseInt(cortarString[3]));

                queue.add(partido);

            }
            System.out.println("... Resultados de los PartidoFutbol de futbol \n" + queue);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (s != null) {
                    s.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            System.out.println("\n" + queue.poll());
            System.out.println(queue.poll() + "\n");

        }
        System.out.println("... Resultados de los partidos de futbol sin los 2 primeros \n" + queue);

    }
}
