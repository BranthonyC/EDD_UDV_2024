package com.example.classes;

public class BubbleSort {

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            System.out.println("Iteración " + (i + 1) + ":");
            boolean intercambiado = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Intercambia los elementos
                    int temp = array[j];
                    System.out.println("Intercambiando " + array[j] + " con " + array[j + 1]);
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    intercambiado = true;
                }
            }
            // Imprime el estado del arreglo después de cada iteración
            imprimirEstadoArreglo(array);

            // Si no se realizó ningún intercambio en esta iteración, significa que el
            // arreglo está ordenado
            if (!intercambiado) {
                break;
            }
        }
    }

    // Método para imprimir el estado actual del arreglo
    public static void imprimirEstadoArreglo(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // public static void main(String[] args) {
    // int[] array = {64, 34, 25, 12, 22, 11, 90};
    // System.out.println("Arreglo original:");
    // imprimirEstadoArreglo(array);
    // bubbleSort(array);
    // System.out.println("\nArray ordenado usando Bubble Sort:");
    // imprimirEstadoArreglo(array);
    // }

}
