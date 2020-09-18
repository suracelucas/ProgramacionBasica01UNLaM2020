package ar.edu.unlam.pb1.trabajoPractico06.dominio;

import java.util.Scanner;

public class PruebaEstadisticasDePersonas {
    private static final int MAXIMA_CANTIDAD_PERSONAS = 3;

    public static void main(String args[]) {
        double pesoTotal = 0;
        int cantidadPersonasConBajoPeso = 0;
        int cantidadPersonasConPesoNormal = 0;
        int cantidadPersonasConSobrePeso = 0;
        int edadTotalPersonasBajoPeso = 0;
        int edadTotalPersonasSobrePeso = 0;
        int personasIngresadas = 0;

        while (personasIngresadas < MAXIMA_CANTIDAD_PERSONAS) {
            Persona personaActual = obtenerPersona();
            pesoTotal += personaActual.pesar();
            switch (personaActual.calcularIMC()) {
                case Persona.INFERIOR_AL_PESO_IDEAL:
                    edadTotalPersonasBajoPeso += personaActual.getEdad();
                    cantidadPersonasConBajoPeso++;
                    break;
                case Persona.PESO_IDEAL:
                    cantidadPersonasConPesoNormal++;
                    break;
                case Persona.SUPERIOR_AL_PESO_IDEAL:
                    edadTotalPersonasSobrePeso += personaActual.getEdad();
                    cantidadPersonasConSobrePeso++;
                    break;
            }
            personasIngresadas++;
        }

        System.out.println("Carga Finalizada");
        System.out.println("-----------------------------------------------------");
        System.out.println("Resultados: ");
        System.out.println("El peso promedio: " + (pesoTotal / personasIngresadas));
        System.out.println("Cantidad de personas con bajo peso: " + cantidadPersonasConBajoPeso);
        System.out.println("Cantidad de personas con peso normal: " + cantidadPersonasConPesoNormal);
        System.out.println("Cantidad de personas con sobre peso: " + cantidadPersonasConSobrePeso);

        System.out.println("-----------------------------------------------------");
        if (edadTotalPersonasBajoPeso > 0) {
            System.out.println("Promedio de edad de las personas con bajo peso: "
                    + (edadTotalPersonasBajoPeso / cantidadPersonasConBajoPeso));
        }

        if (edadTotalPersonasSobrePeso > 0) {
            System.out.println("Promedio de edad de las personas con sobre peso: "
                    + (edadTotalPersonasSobrePeso / cantidadPersonasConSobrePeso));
        }
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
}