package com.example.utils;

import java.io.FileReader;
import com.opencsv.CSVReader;

import com.example.classes.Estudiante;

public class LectorCsv {
    public static Estudiante[] leerEstudiantesDesdeCSV(String archivoCSV) {
        Estudiante[] estudiantes = null;

        try {
            // Crear un lector CSV
            CSVReader lector = new CSVReader(new FileReader(archivoCSV));

            // Contar las líneas para determinar el tamaño del arreglo
            int totalFilas = lector.readAll().size();
            lector.close();

            // Reabrir el lector para leer los datos
            lector = new CSVReader(new FileReader(archivoCSV));

            // Crear el arreglo de estudiantes con el tamaño determinado
            estudiantes = new Estudiante[totalFilas];

            // Leer las líneas del archivo CSV
            String[] fila;
            int indice = 0;
            while ((fila = lector.readNext()) != null) {
                // Convertir los datos de la fila a tipos correspondientes
                System.out.println(fila[0].toString());
                String nombre = fila[0];
                int edad = Integer.parseInt(fila[1]);
                double peso = Double.parseDouble(fila[2]);
                double estatura = Double.parseDouble(fila[3]);
                int nota = Integer.parseInt(fila[4]);
                int grado = Integer.parseInt(fila[5]);

                // Crear un objeto Estudiante y agregarlo al arreglo
                Estudiante estudiante = new Estudiante(nombre, edad, peso, estatura, nota, grado);
                estudiantes[indice] = estudiante;
                indice++;
            }

            // Cerrar el lector
            lector.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return estudiantes;
    }
}
