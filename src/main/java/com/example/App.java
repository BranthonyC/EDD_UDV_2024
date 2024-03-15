package com.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {

    // public static void main(String[] args) {

    // long inicio = System.currentTimeMillis();

    // System.out.println("Brandon Chitay Marzo 2024");

    // // Ejecución de la solución
    // EjercicioPilas.esPalindromo("carro");
    // EjercicioPilas.esPalindromo("oso");
    // // Código a medir
    // long fin = System.currentTimeMillis();
    // // Fin del código a medir

    // System.out.println("Tiempo de ejecución: " + (fin - inicio) +
    // "milisegundos");
    // }

    // EJERCICIO Cola de amigos
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Brandon Chitay Marzo Cola de amigos\n\n");
        System.out.println("Ingrese la cantidad de amigos:");
        int cantidadAmigos = scanner.nextInt();

        Queue<String> amigos = EjercicioPilas.colaDeAmigos(cantidadAmigos);

        System.out.println("\nAmigos en la cola:");
        while (!amigos.isEmpty()) {
            System.out.println(amigos.poll());
        }
    }

    // public static void main(String[] args) {

    // String cadena1 = "[{()}]";
    // String cadena2 = "{[()]}";
    // String cadena3 = "(){}[{}]";
    // String cadena4 = "{[(])}";
    // String cadena5 = "[{]}";

    // long inicio = System.currentTimeMillis();

    // System.out.println("Brandon Chitay Marzo 2024"); // Sustituir por el nombre

    // // Ejecución de la solución
    // System.out.println(cadena1 + " " + EjercicioPilas.estaBalanceada(cadena1));
    // // true
    // // System.out.println(EjercicioPilas.estaBalanceada(cadena2)); // true
    // // System.out.println(EjercicioPilas.estaBalanceada(cadena3)); // true
    // // System.out.println(EjercicioPilas.estaBalanceada(cadena4)); // false
    // // System.out.println(EjercicioPilas.estaBalanceada(cadena5)); // false

    // // Código a medir
    // long fin = System.currentTimeMillis();
    // // Fin del código a medir

    // System.out.println("Tiempo de ejecución: " + (fin - inicio) +
    // "milisegundos");
    // }
}
