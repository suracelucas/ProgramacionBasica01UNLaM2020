package ar.edu.unlam.pb1.trabajopractico11.dominio;

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
			case 4:
				buscarCochesPorPrecio();
				break;
			case 5:
				buscarCochesPorMarca();
				break;
			case 6:
				buscarCochesPorModelo();
				break;
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
		System.out.println("4) Buscar coches por precio.");
		System.out.println("5) Buscar coches por marca");
		System.out.println("6) Buscar coches por modelo");
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
		ordenarPorPrecio(cochesDeFede);
		if(cochesDeFede == null) {
			System.out.println("No hay coches.");
		}else {
			for(int i = 0; i<fede.getUltimaPosicion(); i++) {
				System.out.println("Codigo: " + cochesDeFede[i].getCodigo() + "\nPrecio: " + cochesDeFede[i].getPrecio() + "\nMarca: " + cochesDeFede[i].getMarca() + "\nModelo: " + cochesDeFede[i].getModelo() + "\n");;
			}
		}
		
	}
	
	public static void ordenarPorPrecio(Vehiculo[] vehiculos) {
    	for(int i = 0; i<fede.getUltimaPosicion(); i++) {
    		for(int j = 0; j<fede.getUltimaPosicion()-1; j++) {
    			if(vehiculos[j].getPrecio() < vehiculos[j+1].getPrecio()) {
    				Vehiculo aux = vehiculos[j];
        			vehiculos[j] = vehiculos[j + 1];
        			vehiculos[j + 1] = aux;
    			}
    		}
    	}
    }
	
	public static void mostrarDetalle() {
		int indice;
		
		indice = teclado.nextInt();
		System.out.println(fede.mostrarDetalleVehiculo(indice));
	}

    private static void buscarCochesPorPrecio() {
        System.out.println("Ingrese Rango de precio minimo: ");
        double minimo = teclado.nextDouble();
        System.out.println("Ingrese Rango de precio maximo: ");
        double maximo = teclado.nextDouble();
        Vehiculo[] coches = fede.buscarCochesPorPrecio(minimo, maximo);
        ordenarPorPrecio(coches);
        if (coches == null) {
            System.out.println("No hay ningun coche en ese rango de precios");
            return;
        }

        for (int i = 0; i < coches.length; i++) {
            if (coches[i] != null) {
                System.out.println(coches[i]);
            }
        }
    }

    private static void buscarCochesPorMarca() {
        System.out.println("Ingrese Marca a buscar: ");
        String marca = teclado.next();
        Vehiculo[] coches = fede.buscarCochesPorMarca(marca);
        
        if (coches == null) {
            System.out.println("No hay ningun coche esa marca");
            return;
        }

        for (int i = 0; i < coches.length; i++) {
            if (coches[i] != null) {
                System.out.println(coches[i]);
            }
        }
    }

    private static void buscarCochesPorModelo() {
        System.out.println("Ingrese Modelo a buscar: ");
        String modelo = teclado.next();
        Vehiculo[] coches = fede.buscarCochesPorModelo(modelo);
        
        if (coches == null) {
            System.out.println("No hay ningun coche ese modelo");
            return;
        }

        for (int i = 0; i < coches.length; i++) {
            if (coches[i] != null) {
                System.out.println(coches[i]);
            }
        }
    }
	
}
