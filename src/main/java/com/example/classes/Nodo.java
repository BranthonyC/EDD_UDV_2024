package com.example.classes;

public class Nodo {
    public int dato;
    public Nodo anterior;
    public Nodo siguiente;

    public Nodo(int dato) {
        this.dato = dato;
        this.anterior = null;
        this.siguiente = null;
    }
}