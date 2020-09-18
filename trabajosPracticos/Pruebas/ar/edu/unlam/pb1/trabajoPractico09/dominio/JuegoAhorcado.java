package ar.edu.unlam.pb1.trabajoPractico09.dominio;

import java.util.Scanner;

public class JuegoAhorcado {
	
	static Ahorcado juegoNuevo;
	static final byte CERO = 0;
	static final byte UNO = 1;
	static Scanner teclado = new Scanner(System.in);
	static int turnoActual, oponente;
	static boolean hayGanador = false;
	static boolean finalizarjuego = false;
	
	public static void main(String[] args) {
		
		juegoNuevo = new Ahorcado();
		mostrarMenu();
		turnoActual = juegoNuevo.iniciarTurno();
		int opcion;
		do {
			do {
				turno(juegoNuevo.getJugadores(), turnoActual, hayGanador);
				
				opcion = ingresarOpcion();
				switch(opcion) {
				case 1:
					ingresarLetra(oponente);
					System.out.println(juegoNuevo.getCadena(oponente));
					cambiarTurno();
					break;
				case 2:
					if(arriesgarPalabra()) {
						hayGanador = true;
						turno(juegoNuevo.getJugadores(), turnoActual, hayGanador);
					}else {
						System.out.println("Lo sentimos, la palabra es incorrecta.");
						String nombreGanador = juegoNuevo.getNombreJugadorPedido(oponente);
						System.out.println("El ganador es " + nombreGanador);
						finalizarjuego = true;
					}
					break;
				default:
					System.out.println("Por favor, ingrese una opcion valida.");
					break;
				}
			}while((opcion!=1 || opcion!=2) && !finalizarjuego);
		}while(!finalizarjuego);
	}

	public static void mostrarMenu() {
		String nombreJugadores[] = new String[2];
		String palabraAAdivinar[] = new String[2];
		
		System.out.println("Bienvenido al juego Ahorcado.\nA continuación, ingrese el nombre del jugador 1:");
		nombreJugadores[0] = teclado.next();
		System.out.println("Ingrese el nombre del jugador 2:");
		nombreJugadores[1] = teclado.next();
		System.out.println("Jugador 1, ingrese su palabra:");
		palabraAAdivinar[0] = teclado.next().toLowerCase();
		limpiarPantalla();
		System.out.println("Jugador 2, ingrese su palabra:");
		palabraAAdivinar[1] = teclado.next().toLowerCase();
		limpiarPantalla();
		
		juegoNuevo.crearJugadores(nombreJugadores, palabraAAdivinar);
	}
	
	public static void limpiarPantalla() {
		for(int i = 0; i<1000; i++) {
			System.out.println();
		}
	}
	
	public static boolean turno(Jugador jugadores[], int turno, boolean ganador) {
		if(!ganador) {
			if(turno == CERO) {
				turnoActual = CERO;
				oponente = UNO;
			}else {
				turnoActual = UNO;
				oponente = CERO;
			}
			if(jugadores[turno].getOportunidades() == 0 && jugadores[oponente].getOportunidades() == 0) {
				System.out.println("Ambos jugadores se quedaron sin opciones, hay empate!");
				finalizarjuego = true;
				return true;
			}else {
				if(jugadores[turno].getOportunidades() > 0) {
					System.out.println("*****************************************************");
					System.out.println("Turno de " + jugadores[turnoActual].getNombreJugador());
					System.out.println("Letras incorrectas: " + jugadores[oponente].getCadenaDeLetrasIncorrectas());
					System.out.println("Oportunidades restantes: " + jugadores[turnoActual].getOportunidades());
					System.out.println("Palabra a adivinar: " + jugadores[oponente].getPalabraOculta());
					menuTurno();
					return true;
				}else {
					System.out.println("El jugador " + jugadores[turno].getNombreJugador() + " no tiene mas oportunidades.");
					return false;
				}
			}
		}
		
		if(ganador) {
			System.out.println("*****************************************************");
			System.out.println("Felicidades! " + jugadores[turno].getNombreJugador() + " ha acertado la palabra!\n" + jugadores[oponente].getNombreJugador() + " tiene una sola oportunidad para averiguar la palabra.");
			cambiarTurno();
			System.out.println("Palabra a adivinar: " + jugadores[oponente].getPalabraOculta());
			if(arriesgarPalabra()) {
				System.out.println("Hay empate!");
				hayGanador = false;
				finalizarjuego = true;
			}else {
				System.out.println("*****************************************************");
				System.out.println("Lo sentimos, la palabra es incorrecta... Eso significa que " + jugadores[oponente].getNombreJugador() + " es el ganador!");
				hayGanador = false;
				finalizarjuego = true;
			}
		}
		return false;
	}
	
	public static void menuTurno() {
		System.out.println("1) Arriesgar letra.\n2) Arriesgar palabra.");
	}
	
	public static int ingresarOpcion() {
		int opcion = teclado.nextInt();
		return opcion;
	}
	
	public static void ingresarLetra(int oponente) {
		char letraABuscar;
		System.out.println("Ingrese la letra a buscar:");
		letraABuscar = teclado.next().charAt(0);
		juegoNuevo.buscarLetra(oponente, letraABuscar);
	}
	
	public static boolean arriesgarPalabra() {
		boolean resultado;
		String palabraAAriesgar;
		System.out.println("Ingrese la palabra a arriesgar:");
		palabraAAriesgar = teclado.next().toLowerCase();
		resultado = juegoNuevo.buscarPalabra(palabraAAriesgar, oponente);
		return resultado;
	}
	
	public static void cambiarTurno() {
		int aux = turnoActual;
		turnoActual = oponente;
		oponente = aux;
	}
}
