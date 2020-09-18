package ar.edu.unlam.pb1.ejerciciosEnClase.dominio;

import java.util.Scanner;

public class PruebaPracticaExamen {

	static Scanner teclado = new Scanner(System.in);
	static PracticaExamen practica;
	
	public static void main(String[] args) {
		mostrarMenu();
		
		int opcion;
		do {
			System.out.println("Ingrese una opcion:");
			opcion = ingresarOpcion();
			switch(opcion) {
			case 1:
				vector();
				break;
			case 2:
				matriz();
				break;
			case 9:
				opcion = 0;
				break;
			default:
				System.out.println("Por favor, ingrese un valor valido.");
				break;	
			}
		}while(opcion!=0);
		
	}
	
	private static void matriz() {
		System.out.println("Ingrese la cantidad de filas:");
		int filas = ingresarOpcion();
		System.out.println("Ingrese la cantidad de columnas:");
		int columnas = ingresarOpcion();
		practica = new PracticaExamen(filas, columnas);
		System.out.println("Matriz:");
		imprimirMatriz(practica.getMatriz());
	}
	
	private static void imprimirMatriz(int[][] matrizAImprimir) {
		for(int i = 0; i<matrizAImprimir.length;i++) {
			System.out.print("\t|");
			for(int j = 0; j<matrizAImprimir[0].length;j++) {
				System.out.print(matrizAImprimir[i][j] + "|");
			}
			System.out.print("\n");
		}
	}
	
	private static void vector() {
		int capacidadDelVector;
		System.out.println("Ingrese la cantidad del vector");
		capacidadDelVector = ingresarOpcion();
		practica = new PracticaExamen(capacidadDelVector);
		System.out.println("Vector:");
		System.out.println(imprimirVector(practica.getVector()));

		System.out.println("Vector ordenado:");
		practica.ordenarVector();
		System.out.println(imprimirVector(practica.getVector()));
		
		
		if(buscarValor()) {
			System.out.println("Se encontro el valor en el array");
		}else {
			System.out.println("No se encontro el valor en el array");
		}
	}
	
	private static void mostrarMenu() {
		System.out.println("*****************************************\nBienvenido.\n1) Vector\n2) Matriz\n9) Salir\n*****************************************");
	}
	
	private static int ingresarOpcion() {
		int opcion = teclado.nextInt();
		return opcion;
	}

	private static String imprimirVector(int[] vectorAImprimir) {
		String resultado = "";
		for(int i = 0; i<vectorAImprimir.length; i++) {
			resultado+= "\t|" + vectorAImprimir[i] + "|" + "\n";
		}
		return resultado;
	}
	
	private static boolean buscarValor() {
		return practica.buscarValorEnVector(40);
	}
}
