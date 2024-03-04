package com.example;

import java.util.Stack;

public class EjercicioPilas {
    public static void main(String[] args) {
        String cadena1 = "[{()}]";
        String cadena2 = "{[()]}";
        String cadena3 = "(){}[{}]";
        String cadena4 = "{[(])}";
        String cadena5 = "[{]}";

        System.out.println(estaBalanceada(cadena1)); // true
        System.out.println(estaBalanceada(cadena2)); // true
        System.out.println(estaBalanceada(cadena3)); // true
        System.out.println(estaBalanceada(cadena4)); // false
        System.out.println(estaBalanceada(cadena5)); // false
    }

    public static boolean estaBalanceada(String cadena) {
        Stack<Character> pila = new Stack<>();
        // Debe desarrollar su respuesta aquí.
        // Respuesta por defecto al no haber implementado su respuesta.
        // Debe borrar esta línea al implementar su respuesta.
        return false;
    }
}
