package ar.edu.unlam.pb1.trabajoPractico08.dominio;

import java.util.Scanner;

public class PruebaCalculadora {
    private static Scanner inputTeclado;
    private static Calculadora calculadora;

    public static void main(String args[]) {
        inputTeclado = new Scanner(System.in);
        calculadora = new Calculadora();

        int opcionSeleccionada;
        mostrarMenu();
        do {
            opcionSeleccionada = seleccionarOpcion();
            switch (opcionSeleccionada) {
                case 1:
                    sumar();
                    break;
                case 2:
                    restar();
                    break;
                case 3:
                    multiplicar();
                    break;
                case 4:
                    dividir();
                    break;
                case 5:
                    potencia();
                    break;
                case 6:
                    raiz();
                    break;
                case 7:
                    valorAbsoluto();
                    break;
                default:
                	System.out.println("Por favor, ingrese una opcion valida.");
                    break;
            }
        } while (opcionSeleccionada != 9);
    }

    private static void mostrarMenu() {
        System.out.println("\nBienvenido a calculadora calculadorin");
        System.out.println("****************");
        System.out.println("Menu\n");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Potencia");
        System.out.println("6 - Raiz Cuadrada");
        System.out.println("7 - Valor Absoluto");
        System.out.println("9 - Salir");
        System.out.println("****************");
        System.out.println("Ingrese un opcion");
    }

    private static int seleccionarOpcion() {
        int valor = inputTeclado.nextInt();
        return valor;
    }

    private static void sumar() {
        System.out.println("Ingrese operador uno:");
        double operadorUno = inputTeclado.nextDouble();
        System.out.println("Ingrese operador dos:");
        double operadorDos = inputTeclado.nextDouble();
        System.out.println("El resultado es: " + calculadora.sumar(operadorUno, operadorDos));
    }

    private static void restar() {
        System.out.println("Ingrese operador uno:");
        double operadorUno = inputTeclado.nextDouble();
        System.out.println("Ingrese operador dos:");
        double operadorDos = inputTeclado.nextDouble();
        System.out.println("El resultado es: " + calculadora.restar(operadorUno, operadorDos));
    }

    private static void multiplicar() {
        System.out.println("Ingrese operador uno:");
        double operadorUno = inputTeclado.nextDouble();
        System.out.println("Ingrese operador dos:");
        double operadorDos = inputTeclado.nextDouble();
        System.out.println("El resultado es: " + calculadora.multiplicar(operadorUno, operadorDos));
    }

    private static void dividir() {
        System.out.println("Ingrese numerador:");
        double operadorUno = inputTeclado.nextDouble();
        System.out.println("Ingrese denominador (no puede ser cero):");
        double operadorDos = inputTeclado.nextDouble();
        System.out.println("El resultado es: " + calculadora.dividir(operadorUno, operadorDos));
    }

    private static void potencia() {
        System.out.println("Ingrese base:");
        double operadorUno = inputTeclado.nextDouble();
        System.out.println("Ingrese exponente:");
        double operadorDos = inputTeclado.nextDouble();
        System.out.println("El resultado es: " + calculadora.potencia(operadorUno, operadorDos));
    }

    private static void raiz() {
        System.out.println("Ingrese valor:");
        double operadorUno = inputTeclado.nextDouble();
        System.out.println("El resultado es: " + calculadora.raizCuadrada(operadorUno));
    }

    private static void valorAbsoluto() {
        System.out.println("Ingrese valor:");
        double operadorUno = inputTeclado.nextDouble();
        System.out.println("El resultado es: " + calculadora.valorAbsoluto(operadorUno));
    }
}
