package ar.edu.unlam.pb1.trabajoPractico09.dominio;

import java.util.Scanner;

public class PruebaDeArrayDeEnteros {
    private static final int LONGITUD_MAXIMA = 10;

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int[] enteros = new int[LONGITUD_MAXIMA];

        for (int i = 0; i < LONGITUD_MAXIMA; i++) {
            System.out.println("Ingrese un numero entero");
            enteros[i] = teclado.nextInt();
        }

        System.out.println("Resultados:");
        for (int i = 0; i < LONGITUD_MAXIMA; i++) {
            System.out.println("Indice: " + i + " Valor: " + enteros[i]);
        }
        teclado.close();
    }
}
