package ar.edu.unlam.pb1.trabajoPractico09.dominio;

import java.util.Scanner;

public class PruebaCapicua {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        String cadena, cadenaAlReves = "";

        System.out.println("Ingrese un numero por teclado");
        cadena = teclado.next();

        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaAlReves += cadena.charAt(i);
        }

        if (cadena.equals(cadenaAlReves)) {
            System.out.println("Es capicua");
        } else {
            System.out.println("No es capicua");
        }
        teclado.close();
    }
}