package com.example;

import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main(String[] args) {
        System.out.println("Arreglo original:");

        long inicio = System.currentTimeMillis();
        // Código a medir
        long fin = System.currentTimeMillis();
        // Fin del código a medir
        System.out.println("Tiempo de ejecución: " + (fin - inicio) + " milisegundos");
    }
}
