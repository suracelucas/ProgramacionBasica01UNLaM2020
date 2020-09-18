package ar.edu.unlam.pb1.trabajoPractico08.dominio;

import java.util.Scanner;

public class CajeroAutomatico {
    static Cuenta cuenta;
    static Scanner teclado = new Scanner(System.in);
    static double valor;

    public static void main(String[] args) {
    	cuenta = new Cuenta("Fede");

        Opcion opcionSeleccionada;

        mostrarMenu();
        do {
        	System.out.println("Ingrese un opcion \n");
            opcionSeleccionada = seleccionarOpcion();
            switch (opcionSeleccionada) {
                case DEPOSITAR:
                	depositar();
                    break;
                case EXTRAER:
                	extraer();
                    break;
                case CONSULTAR:
                    consultar();
                    break;
                case INVALIDO:
                	System.out.println("Por favor, ingrese una opcion valida");
                    break;
            }
        } while (opcionSeleccionada != Opcion.SALIR);
    }

    private static void mostrarMenu() {
        System.out.println("\nBienvenido al banco Banquin");
        System.out.println("****************");
        System.out.println("Menu de opciones \n");
        System.out.println("1 - Depositar Dinero");
        System.out.println("2 - Extraer Dinero");
        System.out.println("3 - Consultar Saldo");
        System.out.println("9 - Salir");
        System.out.println("****************");
        
    }

    private static Opcion seleccionarOpcion() {
        int valor = teclado.nextInt();

        switch (valor) {
            case 1:
                return Opcion.DEPOSITAR;
            case 2:
                return Opcion.EXTRAER;
            case 3:
                return Opcion.CONSULTAR;
            case 9:
            	return Opcion.SALIR;
            default:
            	return Opcion.INVALIDO;
        }
    }
    private static void depositar() {
    	System.out.println("\nIngrese valor a depositar: ");
        valor = teclado.nextDouble();
        cuenta.depositar(valor);
    }
    
    
    private static void extraer() {
    	System.out.println("\nIngrese valor a extraer: ");
        valor = teclado.nextDouble();
        cuenta.retirar(valor);
    }
    

    private static void consultar() {
        System.out.println("\nSu saldo actual es de: " + cuenta.getSaldo());
    }
}