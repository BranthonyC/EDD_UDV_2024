package com.example.classes;

import java.util.Scanner;

public class ListaDoblementeEnlazada {
    private Nodo head;
    private Nodo tail;

    // Constructor
    public ListaDoblementeEnlazada() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    // Método para agregar al final de la lista
    public void agregarAlFinal(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (isEmpty()) {
            head = nuevoNodo;
            tail = nuevoNodo;
        } else {
            tail.siguiente = nuevoNodo;
            nuevoNodo.anterior = tail;
            tail = nuevoNodo;
        }
    }

    // Método para agregar al inicio de la lista
    public void agregarAlInicio(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (isEmpty()) {
            head = nuevoNodo;
            tail = nuevoNodo;
        } else {
            nuevoNodo.siguiente = head;
            head.anterior = nuevoNodo;
            head = nuevoNodo;
        }
    }

    // Método para agregar en una posición específica de la lista
    public void agregarEnPosicion(int dato, int posicion) {
        if (posicion < 0) {
            System.out.println("Posición inválida");
            return;
        }
        if (posicion == 0) {
            agregarAlInicio(dato);
            return;
        }

        Nodo nuevoNodo = new Nodo(dato);
        Nodo iterador = head;
        for (int i = 0; i < posicion - 1; i++) {
            if (iterador == null) {
                System.out.println("Posición fuera de rango");
                return;
            }
            iterador = iterador.siguiente;
        }
        if (iterador == null) {
            System.out.println("Posición fuera de rango");
            return;
        }

        nuevoNodo.siguiente = iterador.siguiente;
        if (iterador.siguiente != null) {
            iterador.siguiente.anterior = nuevoNodo;
        }
        nuevoNodo.anterior = iterador;
        iterador.siguiente = nuevoNodo;
        if (nuevoNodo.siguiente == null) {
            tail = nuevoNodo;
        }
    }

    // Método para buscar un elemento en la lista
    public boolean buscar(int dato) {
        Nodo actual = head;
        while (actual != null) {
            if (actual.dato == dato) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    // Método para eliminar un nodo de la lista
    public void eliminarNodo(int dato) {
        if (isEmpty()) {
            return;
        }

        if (head.dato == dato) {
            head = head.siguiente;
            if (head != null) {
                head.anterior = null;
            } else {
                tail = null;
            }
            return;
        }

        Nodo actual = head;
        while (actual != null && actual.dato != dato) {
            actual = actual.siguiente;
        }

        if (actual == null) {
            System.out.println("El valor no existe dentro de la lista doblemente enlazada");
            return;
        }

        if (actual == tail) {
            tail = tail.anterior;
            tail.siguiente = null;
            return;
        }

        actual.anterior.siguiente = actual.siguiente;
        actual.siguiente.anterior = actual.anterior;
    }

    // Método para imprimir la lista
    public void imprimirLista() {
        Nodo actual = head;
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

    public void dibujarLista() {
        Nodo actual = head;
        while (actual != null) {
            System.out.print(actual.dato);
            if (actual.siguiente != null) {
                System.out.print(" ↔ ");
            }
            actual = actual.siguiente;
        }
        System.out.println();
    }

    // Método para recorrer la lista con opciones de avanzar hacia adelante o hacia
    // atrás
    public void recorrerListaConOpciones() {
        Scanner scanner = new Scanner(System.in);
        Nodo actual = head;

        while (actual != null) {
            System.out.println("Valor actual: " + actual.dato);
            System.out.print("Presiona 'd' para avanzar hacia adelante o 'a' para retroceder: ");
            String opcion = scanner.nextLine().trim();

            if (opcion.equalsIgnoreCase("d")) {
                actual = actual.siguiente;
            } else if (opcion.equalsIgnoreCase("a")) {
                actual = actual.anterior;
            } else {
                System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }

        scanner.close();
    }
}
