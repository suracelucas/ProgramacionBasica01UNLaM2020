package ar.edu.unlam.pb1.trabajoPractico08.dominio;

import java.util.Scanner;

public class PruebaEmpleado {
    private static Scanner INPUT_TECLADO;

    public static void main(String args[]) {
        INPUT_TECLADO = new Scanner(System.in);

        int opcionSeleccionada;
        
        mostrarMenu();
        do {
            opcionSeleccionada = seleccionarOpcion();
            switch (opcionSeleccionada) {
                case 1:
                    calcularVacaciones();
                    break;
                default:
                	System.out.println("Por favor, ingrese una opcion valida.");
                    break;
            }
        } while (opcionSeleccionada != 9);
    }

    private static void mostrarMenu() {
        System.out.println("\nBienvenido al trabajo trabajin");
        System.out.println("****************");
        System.out.println("Menu\n");
        System.out.println("1 - Calcular dias de vacaciones");
        System.out.println("9 - Salir");
        System.out.println("****************");
        System.out.println("Ingrese un opcion");
    }

    private static int seleccionarOpcion() {
        int valor = INPUT_TECLADO.nextInt();
        return valor;
    }

    private static void calcularVacaciones() {
        System.out.println("Ingrese apellido del empleado");
        String apellido = INPUT_TECLADO.next();
        System.out.println("Ingrese fecha de ingreso de " + apellido + " en formato mm/yyyy");
        String fechaDeIngreso = INPUT_TECLADO.next();
        Empleado empleado = new Empleado(apellido, fechaDeIngreso);
        String mensaje = apellido + " tiene " + empleado.calcularDiasDeVAcaciones() + " dias de vacaciones";
        System.out.println(mensaje);
    }
}
