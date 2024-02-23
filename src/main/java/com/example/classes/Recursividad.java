package com.example.classes;

public class Recursividad {

    // Ejemplo 1: Factorial utilizando recursividad y ciclo
    public int factorialRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorialRecursion(n - 1);
    }

    public int factorialLoop(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Ejemplo 2: Fibonacci utilizando recursividad y ciclo
    public int fibonacciRecursion(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }

    public int fibonacciLoop(int n) {
        if (n <= 1) {
            return n;
        }
        int fib = 1, prevFib = 1;
        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }

    // Ejemplo 3: Números de Fibonacci utilizando ciclo
    public int fibonacciLoop2(int n) {
        int a = 0, b = 1, c = 0;
        for (int i = 0; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    // Ejemplo 4: Cálculo de números binarios utilizando recursividad
    public String decimalToBinary(int n) {
        if (n == 0) {
            return "0";
        } else if (n == 1) {
            return "1";
        } else {
            return decimalToBinary(n / 2) + n % 2;
        }
    }

    // Ejemplo 5: Cálculo de la suma de dígitos utilizando recursividad
    public int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumOfDigits(n / 10);
    }

    // Ejemplo 6: Cálculo de la longitud de una cadena utilizando recursividad
    public int stringLength(String str) {
        if (str.equals("")) {
            return 0;
        }
        return 1 + stringLength(str.substring(1));
    }
}
