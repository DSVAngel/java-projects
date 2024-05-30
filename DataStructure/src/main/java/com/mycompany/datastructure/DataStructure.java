/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.datastructure;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author tonqu
 */
public class DataStructure {

    public static void main(String[] args) {
        /* LIFO  = Acronimo de Last-In First-Out
           Stack = Pila .- Torre vertical o conjunto de objetos apilados uno encima del otro
           push() =  agruega objetos hasta arriba de la pila 
           pop() = elimina o remueve el objeto de arriba 
         */

        //Declara la pila o stack
        Stack<String> stack = new Stack<String>();
        //System.out.println(stack.empty()); Devuelve un boolean para verificar si esta vacio
        
         stack.push("Minecraft");
         stack.push("Skyrim");
         stack.push("DOOM");
         stack.push("Borderlands");
         stack.push("FFVII");
         
         //String mijuegoFavorito = stack.pop(); // Siempre remueve el ultimo objeto
         //System.out.println(stack.peek()); //Mostrara el ultimo objeto sin necesidad de removerlo
         //System.out.println(stack.search("Minecraft")); //Muestra la poscion del dato buscado, el orden va de abajo hacia arriba comenzando con el 1, de no encontrar el objeto buscado regresa un -1 
   
         /*---------------------------------------------------------------------QUEUE/COLAS---------------------------------------------------------------------------------------------------*/
         
         /*  Queue = FIFO, acronimo de First-in First-out
            add = enqueue, offer()
            remove = dequeue, poll()
         */
         
         //Declara la pila o queue
        Queue<String> queue = new LinkedList<String>(); //Queue es una interfaz, no una clase. Para ello metemos el LinkedList despues del new
         //Priority Queue = FIFO, muestra los datos de mayor relevancia primero y despues los datos a menor relevancia 
         Queue<Double> cola = new PriorityQueue<>();//Collections.reverseOrder() hace que la cola se organice al reves 
         cola.offer(12.);
         cola.offer(14.);
         cola.offer(1.);
         cola.offer(32.);
         
         while(!cola.isEmpty()){
         System.out.println(cola.poll());
         }
         
         /*
         queue.offer("Ximena");
         queue.offer("Luis");
         queue.offer("Manuel");
         
         queue.poll(); // Elimina los primeros objetos o datos del array
         
         System.out.println(queue);
            */
    }
}
