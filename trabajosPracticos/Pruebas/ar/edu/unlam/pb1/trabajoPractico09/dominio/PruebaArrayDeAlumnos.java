package ar.edu.unlam.pb1.trabajoPractico09.dominio;

import java.util.Scanner;

public class PruebaArrayDeAlumnos {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int longitudMaxima = 0;
        String[] alumnos;
        float[] notas;

        System.out.println("Ingrese longitud de los arrays:");
        longitudMaxima = Math.abs(teclado.nextInt());

        alumnos = new String[longitudMaxima];
        notas = new float[longitudMaxima];

        for (int i = 0; i < longitudMaxima; i++) {
            System.out.println("Ingrese nombre del alumno:");
            alumnos[i] = teclado.next();
            System.out.println("Ingrese nota de " + alumnos[i] + ":");
            notas[i] = Math.abs(teclado.nextFloat());
        }

        System.out.println("Carga Finalizada, Resultados:");
        for (int i = 0; i < longitudMaxima; i++) {
            String mensaje = "Alumno: " + alumnos[i];
            mensaje += " - " + getResultado(notas[i]);
            System.out.println(mensaje);
        }
        teclado.close();
    }

    private static String getResultado(float nota) {

        if (nota < 4) {
            return "Reprobado";
        } else if (nota >= 4 && nota <= 6) {
            return "Aprobado";
        }

        return "Promocionado";
    }
}
