package ar.edu.unlam.pb1.trabajoPractico09.dominio;

import java.util.Scanner;

public class PruebaConcesionaria {

	static Concesionaria fede;
	static Scanner teclado = new Scanner(System.in);
	public static void main(String args[]) {
		byte opcion = 0;
		String nombre = "La concesionaria de Fede";
		fede = new Concesionaria(nombre);
	        
		// Datos
		fede.ingresarNuevoVehiculo(new Vehiculo("Fiat", "500", 4000));
		fede.ingresarNuevoVehiculo(new Vehiculo("Citroen", "C3", 422));
		fede.ingresarNuevoVehiculo(new Vehiculo("Fiat", "Uno Sporting", 9000));
		fede.ingresarNuevoVehiculo(new Vehiculo("Fiat", "Argo", 100000));
		fede.ingresarNuevoVehiculo(new Vehiculo("Peugot", "207", 1440000));
		fede.ingresarNuevoVehiculo(new Vehiculo("Fiat", "Cronos", 12000));
		fede.ingresarNuevoVehiculo(new Vehiculo("Fiat", "Mobi", 12000));
		fede.ingresarNuevoVehiculo(new Vehiculo("Fiat", "500X", 90000));
		fede.ingresarNuevoVehiculo(new Vehiculo("Peugot", "208", 240000));

		
		mostrarMenu();
		do {
			opcion = seleccionarOpcion();
			switch(opcion) {
			case 1:
				ingresarVehiculo();
				break;
			case 2:
				mostrarListado();
				break;
			case 3:
				System.out.println("Ingrese el codigo que sea mostrar:");
				mostrarDetalle();
			case 9:
				opcion = 9;
				break;
			default:
					System.out.println("Por favor, ingrese una opcion valida.");
					break;
			}
		}while(opcion!=9);
		
	}
	
	public static byte seleccionarOpcion() {
		System.out.println("Ingrese una opcion:");
		byte ingreso = teclado.nextByte();
		return ingreso;
	}

	public static void mostrarMenu() {
		System.out.println("Bienvenido al Concesionario de Fede\n***********************************");
		System.out.println("Por favor, ingrese una de las siguientes opciones:");
		System.out.println("1) Ingresar nuevo vehiculo.");
		System.out.println("2) Mostrar listado de vehiculos.");
		System.out.println("3) Mostrar detalle de un codigo en particular.");
		System.out.println("9) Salir.\n***********************************");
	}
	
	public static boolean ingresarVehiculo() {
		String marca, modelo;
		int kilometros, ano; 
		double precio;
		System.out.println("Ingrese la marca:");
		marca = teclado.next();
		System.out.println("Ingrese el modelo:");
		modelo = teclado.next();
		System.out.println("Ingrese los kilometros:");
		kilometros = teclado.nextInt();
		System.out.println("Ingrese el ano:");
		ano = teclado.nextInt();
		System.out.println("Ingrese el precio:");
		precio = teclado.nextDouble();
		fede.ingresarNuevoVehiculo(new Vehiculo(marca, modelo, kilometros, ano, precio));
		return true;
	}
	
	public static void mostrarListado() {
		Vehiculo cochesDeFede[];
		cochesDeFede = fede.getCoches();
		if(cochesDeFede == null) {
			System.out.println("No hay coches.");
		}else {
			for(int i = 0; i<fede.getUltimaPosicion(); i++) {
				System.out.println("Codigo: " + i + "\nMarca: " + cochesDeFede[i].getMarca() + "\nModelo: " + cochesDeFede[i].getModelo() + "\n");;
			}
		}
		
	}
	
	public static void mostrarDetalle() {
		int indice;
		indice = teclado.nextInt();
		System.out.println(fede.mostrarDetalleVehiculo(indice));
	}
}
