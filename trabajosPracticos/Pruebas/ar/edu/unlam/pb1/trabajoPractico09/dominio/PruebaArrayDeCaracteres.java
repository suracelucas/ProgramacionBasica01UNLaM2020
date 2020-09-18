package ar.edu.unlam.pb1.trabajoPractico09.dominio;

import java.util.Scanner;

public class PruebaArrayDeCaracteres {
    private static final int COMIENZO_MAYUSCULAS = 65;
    private static final int FINAL_MAYUSCULAS = 90;
    private static final byte CERO = 0;
    private static final int CANTIDAD_DE_MAYUSCULAS = FINAL_MAYUSCULAS - COMIENZO_MAYUSCULAS;

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        char[] arrayDeCaracteres;
        int numeroIngresado = 0;
        String cadenaConstruida = "";

        arrayDeCaracteres = getArrayDeCaracteres();

        do {
            System.out.println("Ingrese un numero por teclado, para finalizar ingrese -1");
            numeroIngresado = teclado.nextInt();
            if (numeroIngresado >= CERO && numeroIngresado <= CANTIDAD_DE_MAYUSCULAS) {
                cadenaConstruida += arrayDeCaracteres[numeroIngresado];
            }
        } while (numeroIngresado != -1);

        teclado.close();
        System.out.println("Carga finalizada");
        System.out.println("La cadena resultado es: " + cadenaConstruida);
    }

    private static char[] getArrayDeCaracteres() {
        char[] arrayDeCaracteres = new char[CANTIDAD_DE_MAYUSCULAS + 1];
        int contador = 0;

        for (int i = COMIENZO_MAYUSCULAS; i <= FINAL_MAYUSCULAS; i++) {
            arrayDeCaracteres[contador] = (char) i;
            contador++;
        }

        return arrayDeCaracteres;
    }
}
