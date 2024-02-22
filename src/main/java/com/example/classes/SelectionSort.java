package com.example.classes;

public class SelectionSort {

    public static void imprimirArreglo(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < n; j++) {
                int actual = array[j];
                int minimo = array[indiceMinimo];
                if (actual < minimo) {
                    indiceMinimo = j;
                }
            }
            int temp = array[indiceMinimo];
            array[indiceMinimo] = array[i];
            array[i] = temp;
        }
    }
}
