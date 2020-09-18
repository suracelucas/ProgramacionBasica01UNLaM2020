package ar.edu.unlam.pb1.trabajoPractico10.dominio;

import java.util.Scanner;

public class PruebaAdministracionDeAula {
    private static Scanner teclado;
    private static AdministracionDeAula adminAula;
    private static final int DOS = 2;

    public static void main(String[] args) {
        adminAula = new AdministracionDeAula(DOS, DOS);
        teclado = new Scanner(System.in);

        int opcionSeleccionada;

        mostrarMenu(true);
        do {
            opcionSeleccionada = seleccionarOpcion();
            switch (opcionSeleccionada) {
                case 1:
                    consultarEscritoriosVacios();
                    break;
                case 2:
                    ocuparEscritorio();
                    break;
                default:
                	System.out.println("Por favor, ingrese una opcion valida.");
                    break;
            }
            mostrarMenu(false);
        } while (opcionSeleccionada != 9);
    }

    private static void mostrarMenu(boolean mostrarBienvenida) {
        if (mostrarBienvenida) {
            System.out.println("\nBienvenido al Administrador de aulas");
        }
        System.out.println("****************");
        System.out.println("Menu de opciones:");
        System.out.println("1 - Mostrar cantidad de escritorios vacios");
        System.out.println("2 - Ocupar escritorio");
        System.out.println("9 - Salir");
        System.out.println("****************");
        System.out.println("Ingrese un opcion");
    }

    private static int seleccionarOpcion() {
        return teclado.nextInt();
    }

    private static void consultarEscritoriosVacios() {
        System.out.println("Cantidad de escritorios vacios: " + adminAula.contarEscritoriosVacios());
    }

    private static void ocuparEscritorio() {
        if (!adminAula.aulaLlena()) {
            boolean operacionExitosa = adminAula.ocuparEscritorio();
            if (operacionExitosa) {
                System.out.println("Escritorio ocupado corretamente.");
            } else {
                System.out.println("Ocurrio un problema, intente nuevamente.");
            }
        } else {
            System.out.println("Aula esta llena.");
        }
    }
}
