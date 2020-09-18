package ar.edu.unlam.pb1.trabajoPractico08.dominio;

import java.util.Scanner;

public class PruebaTragamonedas {
    private static Scanner INPUT_TECLADO;

    public static void main(String args[]) {
        Tragamonedas tragamoneda = new Tragamonedas();
        INPUT_TECLADO = new Scanner(System.in);

        int opcionSeleccionada;
        do {
            mostrarMenu();
            opcionSeleccionada = seleccionarOpcion();
            switch (opcionSeleccionada) {
                case 1:
                    tragamoneda.girar();
                    System.out.println("Tragamoneda posicion inicial:");
                    System.out.println(tragamoneda.getPosiciones());
                    if (tragamoneda.hayPremio()) {
                        System.out.println("Usted ha ganado! que suerte!");
                    } else {
                        System.out.println("Usted no ha ganado! mejor suerte para la proxima!");
                    }
                    break;
                default:
                    break;
            }
        } while (opcionSeleccionada != 9);
    }

    private static void mostrarMenu() {
        System.out.println("\nBienvenido al casino Casinin");
        System.out.println("****************");
        System.out.println("Menu de Tragamonedas \n");
        System.out.println("1 - Girar Tragamonedas");
        System.out.println("9 - Salir");
        System.out.println("****************");
        System.out.println("Ingrese un opcion \n");
    }

    private static int seleccionarOpcion() {
        int valor = INPUT_TECLADO.nextInt();
        return valor;
    }
}