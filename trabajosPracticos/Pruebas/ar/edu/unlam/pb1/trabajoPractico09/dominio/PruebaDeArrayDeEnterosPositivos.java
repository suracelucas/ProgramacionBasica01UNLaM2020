package ar.edu.unlam.pb1.trabajoPractico09.dominio;

import java.util.Scanner;

public class PruebaDeArrayDeEnterosPositivos {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int longitudMaxima = 0;
        int sumaDeEnteros = 0;
        int[] enteros;

        System.out.println("Ingrese longitud del array:");
        longitudMaxima = Math.abs(teclado.nextInt());

        enteros = new int[longitudMaxima];

        for (int i = 0; i < longitudMaxima; i++) {
            enteros[i] = Math.abs((int) (Math.random()*100));
        }

        System.out.println("Resultados:");
        for (int i = 0; i < longitudMaxima; i++) {
            System.out.println("Indice: " + i + " Valor: " + enteros[i]);
            sumaDeEnteros += enteros[i];
        }
        teclado.close();
        System.out.println("Promedio de numeros es: " + sumaDeEnteros / longitudMaxima);
    }
}