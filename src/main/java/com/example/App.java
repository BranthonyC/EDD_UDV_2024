package com.example;

import java.util.Random;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {

        String cadena1 = "[{()}]";
        String cadena2 = "{[()]}";
        String cadena3 = "(){}[{}]";
        String cadena4 = "{[(])}";
        String cadena5 = "[{]}";

        long inicio = System.currentTimeMillis();

        System.out.println("Brandon Chitay Marzo 2024"); // Sustituir por el nombre del estudiante y la fecha

        // Ejecución de la solución
        System.out.println(EjercicioPilas.estaBalanceada(cadena1)); // true
        System.out.println(EjercicioPilas.estaBalanceada(cadena2)); // true
        System.out.println(EjercicioPilas.estaBalanceada(cadena3)); // true
        System.out.println(EjercicioPilas.estaBalanceada(cadena4)); // false
        System.out.println(EjercicioPilas.estaBalanceada(cadena5)); // false

        // Código a medir
        long fin = System.currentTimeMillis();
        // Fin del código a medir

        System.out.println("Tiempo de ejecución: " + (fin - inicio) + " milisegundos");
    }
}
