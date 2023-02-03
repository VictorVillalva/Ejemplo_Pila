/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadpila;

import java.util.Stack;

public class ActividadPila {


    public static void main(String[] args) { 
        Stack pila = new Stack();
        
        pila.push(" ESTADISTICAS DE LA CARRERA ");
        System.out.println(pila.peek());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //System.out.println(pila.pop());
        
        //System.out.println(pila.empty());
        
        pila.push("1. Marcos ~ 12.52 segundos");                  
        pila.push("2. Andres ~ 12.65 segundos");
        pila.push("3. Omar ~ 12.79 segundos");       
        pila.push("4. Alex ~ 12.98 segundos");
        pila.push("5. Carlos ~ 13.00 segundos");
        System.out.println("¿No hay competidores? "+ pila.empty()+"\n");
        System.out.println(pila.pop());
        System.out.println(pila.pop());
        System.out.println(pila.pop());
        System.out.println(pila.pop());
        
        System.out.println("          GANADOR");
        System.out.println(pila.peek());



    }
    
}
