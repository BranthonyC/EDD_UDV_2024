package com.example;

import java.util.Random;

import com.example.classes.ListaSimplementeEnlazada;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main(String[] args) {
        ListaSimplementeEnlazada lista = new ListaSimplementeEnlazada();

        // Agregar elementos a la lista
        lista.agregarAlInicio(5);
        lista.agregarAlFinal(10);
        lista.agregarAlFinal(15);
        lista.agregarEnPosicion(8, 1);

        // Imprimir la lista
        System.out.println("Lista después de agregar elementos:");
        lista.dibujarLista();

        // Buscar un elemento en la lista
        int elementoBuscado = 10;
        boolean encontrado = lista.buscar(elementoBuscado);
        if (encontrado) {
            System.out.println("El elemento " + elementoBuscado + " se encuentra en la lista.");
        } else {
            System.out.println("El elemento " + elementoBuscado + " no se encuentra en la lista.");
        }

        // Eliminar un nodo de la lista
        int elementoAEliminar = 8;
        lista.eliminarNodo(elementoAEliminar);

        // Imprimir la lista después de eliminar un elemento
        System.out.println("Lista después de eliminar el elemento " + elementoAEliminar + ":");
        lista.dibujarLista();

        // Intentar eliminar un elemento que no está en la lista
        int elementoNoExistente = 20;
        lista.eliminarNodo(elementoNoExistente);

        // Imprimir la lista después de intentar eliminar un elemento que no está en la
        // lista
        System.out.println("Lista después de intentar eliminar el elemento " + elementoNoExistente + ":");
        lista.dibujarLista();

        // Agregar un elemento al inicio de una lista vacía
        lista = new ListaSimplementeEnlazada(); // Reinicializar la lista
        lista.agregarAlInicio(100);
        System.out.println("Lista después de agregar un elemento al inicio de una lista vacía:");
        lista.dibujarLista();

        // Agregar un elemento en una posición inválida
        lista.agregarEnPosicion(200, -1);
        System.out.println("Lista después de intentar agregar un elemento en una posición inválida:");
        lista.dibujarLista();

        // Agregar un elemento en una posición fuera de rango
        lista.agregarEnPosicion(200, 10);
        System.out.println("Lista después de intentar agregar un elemento en una posición fuera de rango:");
        lista.dibujarLista();

        // Eliminar un nodo de una lista vacía
        lista = new ListaSimplementeEnlazada(); // Reinicializar la lista
        lista.eliminarNodo(5);

        // Imprimir la lista después de intentar eliminar un nodo de una lista vacía
        System.out.println("Lista después de intentar eliminar un nodo de una lista vacía:");
        lista.dibujarLista();
    }

}
