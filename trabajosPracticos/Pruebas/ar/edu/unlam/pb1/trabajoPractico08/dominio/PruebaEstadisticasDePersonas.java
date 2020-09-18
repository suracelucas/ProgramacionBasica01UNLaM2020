package ar.edu.unlam.pb1.trabajoPractico08.dominio;

import java.util.Scanner;

public class PruebaEstadisticasDePersonas {
    private static Scanner INPUT_TECLADO;
    private static CalculoDePersonas CALCULO_PERSONAS;

    public static void main(String args[]) {

        INPUT_TECLADO = new Scanner(System.in);
        CALCULO_PERSONAS = new CalculoDePersonas();

        int opcionSeleccionada;
        do {
            mostrarMenu();
            opcionSeleccionada = seleccionarOpcion();
            switch (opcionSeleccionada) {
                case 1:
                    ingresarDatos();
                    mostrarResultados();
                    break;
                case 2:
                    mostrarResultados();
                    break;
                default:
                    break;
            }
        } while (opcionSeleccionada != 9);
    }

    private static void mostrarMenu() {
        System.out.println("Bienvenido al indec indequin");
        System.out.println("Menu Principal");
        System.out.println("****************");
        System.out.println("1 - Nuevo Ingreso de Datos");
        System.out.println("2 - Mostrar Resultados");
        System.out.println("9 - Salir");
        System.out.println("****************");
        System.out.println("Ingrese un opcion");
    }

    private static void mostrarMenuDatos() {
        System.out.println("Menu Datos");
        System.out.println("****************");
        System.out.println("1 - Continuar Ingresando Datos");
        System.out.println("9 - Mostrar resultados y salir");
        System.out.println("****************");
        System.out.println("Ingrese un opcion");
    }

    private static int seleccionarOpcion() {
        int valor = INPUT_TECLADO.nextInt();
        return valor;
    }

    private static void ingresarDatos() {
        int opcionSeleccionada = 1;
        do {
            switch (opcionSeleccionada) {
                case 1:
                    Persona persona = obtenerPersona();
                    calcularVariables(persona);
                    break;
                default:
                    break;
            }
            mostrarMenuDatos();
            opcionSeleccionada = seleccionarOpcion();
        } while (opcionSeleccionada != 9);
    }

    private static Persona obtenerPersona() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese Nombre de la persona: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese edad de " + nombre + ":");
        int edad = scanner.nextInt();
        System.out.println("Ingrese peso de " + nombre + ":");
        double peso = scanner.nextDouble();
        System.out.println("Ingrese altura de " + nombre + ":");
        double altura = scanner.nextDouble();
        System.out.println("\n");
        return new Persona(nombre, edad, peso, altura);
    }

    private static void calcularVariables(Persona persona) {
        CALCULO_PERSONAS.sumarPeso(persona.pesar());
        CALCULO_PERSONAS.calcularImc(persona.calcularIMC(), persona.getEdad());
        CALCULO_PERSONAS.sumarPersona();
    }

    private static void mostrarResultados() {
        System.out.println("\n\nResultados: ");
        System.out.println("El peso promedio: " + CALCULO_PERSONAS.getPesoPromedio());
        System.out.println("Cantidad de personas con bajo peso: " + CALCULO_PERSONAS.getPersonasBajoPeso());
        System.out.println("Cantidad de personas con peso normal: " + CALCULO_PERSONAS.getPersonasPesoNormal());
        System.out.println("Cantidad de personas con sobre peso: " + CALCULO_PERSONAS.getPersonasSobrePeso());
        System.out.println("Promedio de edad de las personas con bajo peso: "
                + CALCULO_PERSONAS.getPromedioDeEdadDePersonasConBajoPeso());
        System.out.println("Promedio de edad de las personas con sobre peso: "
                + CALCULO_PERSONAS.getPromedioDeEdadDePersonasConSobrePeso());
        System.out.println("\n");
    }
}