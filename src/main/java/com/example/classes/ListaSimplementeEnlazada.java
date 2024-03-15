package com.example.classes;

public class ListaSimplementeEnlazada {
    private Nodo head;
    private Nodo tail;

    // Constructor
    public ListaSimplementeEnlazada() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public void agregarEnListaVacia(Nodo nuevoNodo) {
        head = nuevoNodo;
        tail = nuevoNodo;
    }

    // Método para agregar al final de la lista
    public void agregarAlFinal(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (this.isEmpty()) {
            agregarEnListaVacia(nuevoNodo);
            return;
        }
        tail.siguiente = nuevoNodo;
        tail = nuevoNodo;
    }

    // Método para agregar al inicio de la lista
    public void agregarAlInicio(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (this.isEmpty()) {
            agregarEnListaVacia(nuevoNodo);
            return;
        }
        nuevoNodo.siguiente = head;
        head = nuevoNodo;
    }

    // Método para agregar en una posición específica de la lista
    public void agregarEnDato(int dato, int dato_buscado) {
        Nodo iterador = tail;
        Nodo anterior = null;

        while (iterador != null && iterador.dato != dato_buscado) {
            anterior = iterador;
            iterador = iterador.siguiente;
        }

        if (iterador == null) {
            System.out.println("Posición fuera de rango");
            return;
        }
        Nodo nuevoNodo = new Nodo(dato);
        nuevoNodo.siguiente = iterador;
        if (anterior != null)
            anterior.siguiente = nuevoNodo;
        else
            head = nuevoNodo;
    }

    public void agregarEnPosicion(int dato, int posicion) {
        if (posicion < 0) {
            System.out.println("Posición inválida");
            return;
        }
        if (posicion == 0) {
            agregarAlInicio(dato);
            return;
        }
        Nodo iterador = tail;
        Nodo anterior = null;
        for (int i = 0; i < posicion - 1; i++) {
            if (iterador == null) {
                System.out.println("Posición fuera de rango");
                return;
            }
            anterior = iterador;
            iterador = iterador.siguiente;
        }
        if (iterador == null) {
            System.out.println("Posición fuera de rango");
            return;
        }

        Nodo nuevoNodo = new Nodo(dato);
        if (anterior == null) { // Insert at the beginning if anterior is null
            nuevoNodo.siguiente = head;
            head = nuevoNodo;
        } else {
            nuevoNodo.siguiente = iterador;
            anterior.siguiente = nuevoNodo;
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
        if (this.isEmpty()) {
            return;
        }
    
        if (tail.dato == dato) {
            tail = tail.siguiente;
        }
        Nodo iterador = tail;
        Nodo anterior = null;
        if (head.dato == dato) { // check if the head node is the one to be deleted
            head = head.siguiente;
            return;
        }
        while (iterador != null && iterador.dato != dato) {
            anterior = iterador;
            iterador = iterador.siguiente;
        }
        if (iterador == null) {
            System.out.println("El valor no existe dentro de la lista simplemente enlazada");
            return;
        }
        anterior.siguiente = iterador.siguiente;
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
                System.out.print(" → ");
            }
            actual = actual.siguiente;
        }
        System.out.println();
    }
}
