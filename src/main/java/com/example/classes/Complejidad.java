package com.example.classes;
import java.util.Arrays;

public class Complejidad {

    // O(n) < O(n^2) < O(n^3)

    // Función con complejidad temporal lineal O(n)
    public static int encontrarMinimoLineal(int[] arreglo) {
        int minimo = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < minimo) {
                minimo = arreglo[i];
            }
        }
        return minimo;
    }

    // Función con complejidad temporal cuadrática O(n^2)
    public static int encontrarMinimoCuadratico(int[] arreglo) {
        int minimo = arreglo[0];
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length; j++) {
                if (arreglo[j] < minimo) {
                    minimo = arreglo[j];
                }
            }
        }
        return minimo;
    }

    // Función con complejidad temporal cúbica O(n^3)
    public static int encontrarMinimoCubico(int[] arreglo) {
        int minimo = arreglo[0];
        for (int i = 0; i < arreglo.length; i++) { // O(n)
            for (int j = 0; j < arreglo.length; j++) { // O(n) = O(n^2)
                for (int k = 0; k < arreglo.length; k++) { // O(n) = O(n^3)
                    if (arreglo[k] < minimo) {
                        minimo = arreglo[k];
                    }
                }
            }
        }
        return minimo;
    }
}
