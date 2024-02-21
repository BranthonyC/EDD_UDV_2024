package com.example;

import com.example.classes.Estudiante;
import com.example.utils.LectorCsv;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estudiante[] estudiantes = null;
        
        boolean salir = false;

        while (!salir) {
            System.out.println("Menú:");
            System.out.println("1. Cargar datos");
            System.out.println("2. Imprimir arreglo");
            System.out.println("3. Salir del programa");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    // Cargar datos
                    estudiantes = LectorCsv.leerEstudiantesDesdeCSV(
                            "/Users/branthonycc/DaVinci/EDD/complejidad/src/main/java/com/example/datos.csv");
                    System.out.println("¡Datos cargados correctamente!");
                    break;
                case 2:
                    // Imprimir arreglo
                    if (estudiantes == null) {
                        System.out.println("Error: No hay datos cargados.");
                    } else {
                        System.out.println("Estudiantes cargados:");
                        for (int i = 0; i < estudiantes.length; i++) {
                            System.out.println(estudiantes[i].toString());
                        }
                    }
                    break;
                case 3:
                    // Salir del programa
                    salir = true;
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }

        scanner.close();
    }
}
