package com.example;
import com.example.classes.BubbleSort;
import com.example.classes.Complejidad;
import com.example.classes.InsertionSort;
import com.example.classes.Quicksort;
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
        
        // int[] arreglo = new int[N_ELEMENTOS];
        int[] arreglo = { 4, 7, 3, 6, 5, 2, 1, 8 };

        System.out.println("Arreglo original:");
        Quicksort.imprimirArreglo(arreglo);

        long inicio = System.currentTimeMillis();
        // Código a medir
        Quicksort.sort(arreglo, 0, arreglo.length - 1);
        long fin = System.currentTimeMillis();
        // Fin del código a medir
        System.out.println("Arreglo ordenado:");
        Quicksort.imprimirArreglo(arreglo);
        System.out.println("Tiempo de ejecución (Orden Lineal): " + (fin - inicio) + " milisegundos");
    }
}
