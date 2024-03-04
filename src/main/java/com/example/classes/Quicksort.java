package com.example.classes;

public class Quicksort {

    public static void imprimirArreglo(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void sort(int[] array, int izq, int der) {
        if (izq >= der) {
            return; // Si ya estamos en la misma posición o izq >= der, no hay nada que ordenar
        }

        int pivote = array[izq]; // Seleccionamos el primer elemento como pivote
        int i = izq + 1; // Se inicia i en la posición siguiente a izq
        int j = der; // Se inicia j en la última posición (derecha)

        while (i <= j) {
            // Mientras i no supere a j, busca un valor a la derecha de i que sea mayor que
            // el pivote
            while (i <= der && array[i] <= pivote) {
                i++;
            }
            // Mientras j no supere a i, busca un valor a la izquierda de j que sea menor
            // que el pivote
            while (j >= izq && array[j] > pivote) {
                j--;
            }
            // Si i sigue siendo menor o igual a j, intercambia los elementos en esas
            // posiciones
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        // Luego de que i y j se crucen, coloca el pivote en la posición final donde se
        // detuvo j
        array[izq] = array[j];
        array[j] = pivote;

        // Ordena las sub-listas izquierda y derecha recursivamente
        sort(array, izq, j - 1);
        sort(array, j + 1, der);
    }

}
