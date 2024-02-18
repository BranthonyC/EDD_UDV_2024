package com.example;
import com.example.classes.BubbleSort;
import com.example.classes.Complejidad;
import com.example.classes.InsertionSort;
import com.example.classes.SelectionSort;

import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main(String[] args) {
        int N_ELEMENTOS = 8;
        
        int[] arreglo = new int[N_ELEMENTOS];
        Random random = new Random();

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextInt(101);
        }

        System.out.println("Arreglo original:");
        BubbleSort.imprimirArreglo(arreglo);

        BubbleSort.bubbleSort(arreglo);
        // InsertionSort.sort(arreglo);
        // SelectionSort.sort(arreglo);

        System.out.println("Arreglo ordenado:");
        BubbleSort.imprimirArreglo(arreglo);

        long inicio = System.currentTimeMillis();
        // Código a medir
        int minimoLineal = Complejidad.encontrarMinimoLineal(arreglo);
        long fin = System.currentTimeMillis();

        // System.out.println("Mínimo (Orden Lineal): " + minimoLineal);
        System.out.println("Tiempo de ejecución (Orden Lineal): " + (fin - inicio) + " milisegundos");

        // // Orden cuadrático
        // inicio = System.currentTimeMillis();
        // int minimoCuadratico = Complejidad.encontrarMinimoCuadratico(arreglo);
        // fin = System.currentTimeMillis();
        // System.out.println("Mínimo (Orden Cuadrático): " + minimoCuadratico);
        // System.out.println("Tiempo de ejecución (Orden Cuadrático): " + (fin - inicio) + " milisegundos");

        // // Orden cúbico
        // inicio = System.currentTimeMillis();
        // int minimoCubico = Complejidad.encontrarMinimoCubico(arreglo);
        // fin = System.currentTimeMillis();
        // System.out.println("Mínimo (Orden Cúbico): " + minimoCubico);
        // System.out.println("Tiempo de ejecución (Orden Cúbico): " + (fin - inicio) + " milisegundos");
    }
}
