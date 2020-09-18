package ar.edu.unlam.pb1.pruebaEvaluacion.dominio;

import java.util.Scanner;

public class Checkin {
	
	public static void main(String[] args) {
		
		System.out.println("Bienvenido ");
		int CantidadPasajero = 192;
		Vuelo vuelo = new Vuelo("Buenos Aires", "Bariloche", CantidadPasajero);
		int opcion = 0;
		
		do {
			opcion = seleccionarOpcion();
			switch (opcion) {
			case 1:
				registrarPasajero(vuelo);
				break;
			case 2:
				elegirAsiento(vuelo);
				break;
			case 3:
				listarPasajeros(vuelo);
				break;
			case 4:
				System.out.println(vuelo.toString());
			case 9:
				opcion = 9;
			default:
				System.out.println("Opción Invalida");
				break;
			}
		} while (opcion != 9);
	}
	
	private static int seleccionarOpcion() {
		Scanner teclado = new Scanner(System.in);
		int opcionSeleccionada=0;
		
		System.out.println("************************");
		System.out.println("Menu de opciones\n");
		System.out.println("1 - Registrar pasajero");
		System.out.println("2 - Elegir Asiento");
		System.out.println("3 - Listar pasajeros");
		System.out.println("4 - Mostrar asientos");
		System.out.println("9 - Salir");
		System.out.println("************************");
		System.out.println("Ingrese una opcion");
		
		opcionSeleccionada = teclado.nextInt();
		return opcionSeleccionada;
	}
	
	public static void registrarPasajero(Vuelo actual) {
		/*
		 * Interfaz de usuario encargada de cargar un pasajero al vuelo. Debe
		ingresar los datos necesarios e informar por pantalla el resultado de la operación
		 */
		
		Scanner teclado = new Scanner(System.in);
		String nombre, apellido;
		int dni;
		
		System.out.println("Ingrese el apellido del pasajero:");
		apellido = teclado.next();
		System.out.println("Ingrese el nombre del pasajero:");
		nombre = teclado.next();
		System.out.println("Ingrese el dni del pasajero:");
		dni = teclado.nextInt();
		Pasajero pasajeroAIngresar = new Pasajero(dni, nombre, apellido);
		if(actual.agregarPasajero(pasajeroAIngresar)) {
			System.out.println("Se agregó al pasajero correctamente.");
		}else {
			System.out.println("El vuelo se encuentra lleno.");
		}
	}
	
	private static void elegirAsiento(Vuelo actual) {
		/*
		* Interfaz de usuario encargada de gestionar la asignación de
		asientos en el vuelo. Debe permitir el ingreso de los datos y mostrar por pantalla
		el resultado de la operación
		*/
		
		Scanner teclado = new Scanner(System.in);
		int dni, fila, columna;
		Pasajero pasajeroASentar;
		
		System.out.println("Ingrese el dni del pasajero a buscar:");
		dni = teclado.nextInt();
		
		pasajeroASentar = actual.buscarPasajero(dni);
		if(pasajeroASentar == null) {
			System.out.println("No se encuentra un pasajero con el dni ingresado.");
		}else {
			System.out.println("Ingrese la fila:");
			fila = teclado.nextInt();
			System.out.println("Ingrese la columna:");
			columna = teclado.nextInt();
			if(actual.asignarAsiento(pasajeroASentar, fila, columna)) {
				System.out.println("Asiento asignado exitosamente.");
			}else {
				System.out.println("El asiento se encuentra ocupado.");
			}
		}
	}
	
	private static void listarPasajeros(Vuelo actual) {
		/*
		* Se debe mostrar la lista de pasajeros registrados para éste vuelo
		ordenados por DNI
		*/
		actual.ordenarListaDePasajerosPorDNI();
		Pasajero pasajerosOrdenados[] = actual.getPasajeros();
		if(pasajerosOrdenados[0] == null) {
			System.out.println("No hay pasajeros");
		}else {
			for(int i = 0; i<pasajerosOrdenados.length; i++) {
				System.out.println(pasajerosOrdenados[i] + "\n");
			}
		}
	}	
}
