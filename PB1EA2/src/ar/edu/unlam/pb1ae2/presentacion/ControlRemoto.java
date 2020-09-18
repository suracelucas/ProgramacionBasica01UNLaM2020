package ar.edu.unlam.pb1ae2.presentacion;

import java.util.Scanner;

import ar.edu.unlam.pb1ae2.dominio.Televisor;

public class ControlRemoto {

	static Televisor televisor1;
	
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		// Ingrese Los datos necesarios para crear un TV
		// Luego prenda la tv
		// Seleccione La entrada de aire ya que todos los cambios de canales
		// seran sobre esta entrada
		
		byte canalMaximoDeAire = 127;
		short canalMaximoPorCable = 300;
		int opcion;
		televisor1 = new Televisor(canalMaximoDeAire, canalMaximoPorCable);
		televisor1.encenderOApagar();
		televisor1.seleccionarEntrada(televisor1.getEntradaTelevisionDeAire());
		
		mostrarMenu();
		
		do {
			opcion = seleccionarOpcion();
			
			switch(opcion) {
			case 1:
				char primerDigito, segundoDigito, tercerDigito, cuartoDigito;
				System.out.println("Ingrese el primer digito: ");
				
				primerDigito = teclado.next().charAt(0);
				
				System.out.println("Ingrese el segundo digito: ");
				segundoDigito = teclado.next().charAt(0);
				
				System.out.println("Ingrese el tercer digito: ");
				tercerDigito = teclado.next().charAt(0);
				
				System.out.println("Ingrese el cuarto digito: ");
				cuartoDigito = teclado.next().charAt(0);
				
				if(cambiarCanal(primerDigito, segundoDigito, tercerDigito, cuartoDigito)){
					System.out.println("Canal cambiado con exito. Canal: "+televisor1.getCanalActual() + ".\n");
				}else {
					System.out.println("Error al cambiar de canal.\n");
				}
				
				break;
				
			case 2:
				System.out.println("Ingrese n: ");
				int cantidadDeVecesASubir = teclado.nextInt();
				if(subirElVolumneNVeces(cantidadDeVecesASubir)) {
					System.out.println("Exito al subir el volumen.\n");
					System.out.println("Volumen actual: "+televisor1.getVolumenActual()+ ".\n");
				}else {
					System.out.println("Volumen actual: "+televisor1.getVolumenActual()+ ".\n");
					System.out.println("No puede seguir subiendo el volumen, pues esta al maximo.\n");
				}
				break;
				
			case 3:
				System.out.println("Ingrese n: ");
				int cantidadDeVecesABajar = teclado.nextInt();
				if(bajarElVolumneNVeces(cantidadDeVecesABajar)) {
					System.out.println("Exito al bajar el volumen.\n");
					System.out.println("Volumen actual: "+televisor1.getVolumenActual()+ ".\n");
				}else {
					System.out.println("Volumen actual: "+televisor1.getVolumenActual()+ ".\n");
					System.out.println("No puede seguir bajando el volumen, pues esta al minimo.\n");
				}
				break;
			case 9:
				opcion = 0;
				break;
			default:
					System.out.println("Opcion ingresada no valida, reintente.\n");
				break;
			}
			
		}
		while(opcion!=0);
		teclado.close();
	}
 
	/*
	 * 
	 * devuelve la opcion seleccionada  
	 */
	
	
	private static void mostrarMenu() {
		System.out.println("Bienvenido\n"
				+ "****************************\n"
				+ "Menu de opciones\n\n"
				+ "1 - Cambiar de canal\n"
				+ "2 - Subir el volumen n veces\n"
				+ "3 - Bajar el volumen n veces\n"
				+ "9 - Salir\n"
				+ "****************************\n");
	}

	/*
	 * Se Ingresa una opcion por teclado y se devuelve la misma
	 */
	private static int seleccionarOpcion() {
		System.out.println("Ingrese una opcion: ");
		int opcionIngresada = teclado.nextInt();
		return opcionIngresada;
	}
	/*
	 *  Si Puede cambiar de canal devuelve un true en caso contrario false
	 */
	public static boolean cambiarCanal(char primerDigito, char segundoDigito, char tercerDigito, char cuartoDigito) {
		if(televisor1.cambiarDeCanal(primerDigito, segundoDigito, tercerDigito, cuartoDigito)) {
			return true;
		}
		return false;
	}

	/*
	 * / Sube el volumen N veces en caso si puede incrementar / las cantidad de
	 * veces devuelve true sino deveulve false
	 */
	public static boolean subirElVolumneNVeces(int cantidadDeVeces) {
		for(int i = 0; i<cantidadDeVeces; i++) {
			if(!televisor1.subirOBajarAnalogicamente('+')) {
				
				return false;
			}
		}
		return true;
	}

	/*
	 * baja el volumen N veces en caso si puede decrementar las cantidad de veces
	 * devuelve true sino deveulve false
	 */
	public static boolean bajarElVolumneNVeces(int cantidadDeVeces) {
		for(int i = 0; i<cantidadDeVeces; i++) {
			if(!televisor1.subirOBajarAnalogicamente('-')) {
				
				return false;
			}
		}
		return true;
	}

}
