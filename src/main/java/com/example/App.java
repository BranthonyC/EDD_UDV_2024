package com.example;

import java.util.Random;

import com.example.classes.ListaDoblementeEnlazada;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main(String[] args) {
        ListaDoblementeEnlazada lista = new ListaDoblementeEnlazada();

        // Agregar algunos elementos a la lista
        lista.agregarAlFinal(10);
        lista.agregarAlFinal(20);
        lista.agregarAlFinal(30);
        lista.agregarAlFinal(40);
        lista.agregarAlFinal(50);
        // Imprimir la lista
        System.out.println("Lista original:");
        lista.imprimirLista();

        // Recorrer la lista con opciones
        System.out.println("\nRecorriendo la lista con opciones:");
        lista.recorrerListaConOpciones();

        // Imprimir la lista nuevamente después de recorrerla
        System.out.println("\nLista después de recorrerla:");
        lista.imprimirLista();
    }
}
