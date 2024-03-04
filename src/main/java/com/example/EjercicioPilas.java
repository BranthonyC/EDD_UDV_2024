package com.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class EjercicioPilas {

    public static boolean estaBalanceada(String cadena) {
        Stack<Character> pila = new Stack<>();
        char[] characters = cadena.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == '(' || characters[i] == '{' || characters[i] == '[') {
                pila.push(characters[i]);
            } else {
                if (pila.isEmpty()) {
                    return false;
                }
                if (characters[i] == ')' && pila.peek() == '(') {
                    pila.pop();
                } else if (characters[i] == '}' && pila.peek() == '{') {
                    pila.pop();
                } else if (characters[i] == ']' && pila.peek() == '[') {
                    pila.pop();
                } else {
                    return false;
                }
            }
        }
        return pila.isEmpty();
    }

    public static boolean esPalindromo(String texto) {
        LinkedList<Character> pila = new LinkedList<>();
        LinkedList<Character> cola = new LinkedList<>();

        for (char c : texto.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                pila.push(c);
                cola.add(c);
            }
        }

        while (!pila.isEmpty() && !cola.isEmpty()) {
            if (pila.pop() != cola.poll()) {
                return false;
            }
        }

        return true;
    }

    public static Queue<String> colaDeAmigos(int cantidadAmigos) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> cola = new LinkedList<>();

        for (int i = 0; i < cantidadAmigos; i++) {
            scanner.nextLine(); // Limpiar el buffer
            System.out.println("Ingrese el nombre del amigo " + (i + 1) + ":");
            cola.add(scanner.nextLine());
        }
        scanner.close();

        return cola;
    }
}
