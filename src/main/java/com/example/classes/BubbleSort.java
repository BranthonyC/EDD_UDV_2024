package com.example.classes;

// TDA BubbleSort Ordanamiento Burbuja
// Complejidad temporal: O(n^2)
// Complejidad espacial: O(1)
// BubbleSort es un algoritmo de ordenamiento que recorre el arreglo varias veces, comparando cada par de elementos adyacentes y 
// realizando un intercambio si están en el orden incorrecto. El proceso se repite hasta que el arreglo esté ordenado.

public class BubbleSort {

    // imprimir contenido del arreglo
    public static void imprimirArreglo(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Compara los elementos adyacentes de la lista.
    // En cuanto a espacio es O(1) ya que no se utiliza memoria adicional
    public static void bubbleSort(int[] array) { // O(n^2) en cuanto a tiempo
        int n = array.length;
        for (int i = 0; i < n - 1; i++) { // O(nxn) => O(n^2)
            System.out.println("Iteracion " + (i + 1) + ":"); // O(1)
            boolean intercambiado = false; // O(1)
            for (int j = 0; j < n - 1 - i; j++) { // O(6n) => O(n)
                if (array[j] > array[j + 1]) { // es el actual, mayor que el siguiente // O(1)
                    int temp = array[j]; // O(1)
                    System.out.println("Intercambiando " + array[j] + " con " + array[j + 1]); // O(1)
                    array[j] = array[j + 1]; // O(1)
                    array[j + 1] = temp; // O(1)
                    intercambiado = true; // O(1)
                }
            }
            // Imprime el estado del arreglo después de cada iteración
            imprimirArreglo(array);
            if (!intercambiado) {
                break;
            }
        }
    }
}
