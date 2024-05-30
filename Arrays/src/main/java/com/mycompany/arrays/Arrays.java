/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.arrays;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author tonqu
 */
public class Arrays {

    public static void main(String[] args) {
        ArrayList<Partidos> partidos = new ArrayList<Partidos>();
        File fichero = new File("C:\\Users\\tonqu\\Downloads\\partidos.txt");
        Scanner s = null;
        try {
            System.out.println("... Leemos el contenido del fichero");
            s = new Scanner(fichero);
            while (s.hasNextLine()) {
                String linea = s.nextLine();
                String[] cortarString = linea.split("::");
                Partidos partido = new Partidos();

                partido.setEquipoLocal(cortarString[0]);
                partido.setEquipoVisitante(cortarString[1]);
                partido.setGolesLocal(Integer.parseInt(cortarString[2]));
                partido.setGolesVisitante(Integer.parseInt(cortarString[3]));

                partidos.add(partido);

            }
            System.out.println("... Resultados de los partidos de futbol");
            Iterator<Partidos> iterator = partidos.iterator();
            while (iterator.hasNext()) {
                Partidos partido = iterator.next();
                System.out.println(partido.getEquipoLocal() + " "
                        + partido.getEquipoVisitante() + " "
                        + partido.getGolesLocal() + " "
                        + partido.getGolesVisitante());
            }
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
            System.out.println("...Guardados  "+partidos.size()+"  Partidos de futbol... ");
            /*
                Cliente
                Turno
                Prioridad 1-3
                Nombre
                Listas ligadas
                Array List
            */
        }

    }
}
