package ar.edu.unlam.pb1.trabajoPractico09.dominio;

public class Ahorcado {

	private static Jugador jugadores[];
	private final byte CANTIDAD_DE_JUGADORES = 2;
	private final byte CIEN = 100;
	private final byte DOS = 2;
	private final byte CERO = 0;
	private final byte UNO = 1;
	
	public Ahorcado() {
		jugadores = new Jugador[CANTIDAD_DE_JUGADORES];
	}
	
	public void crearJugadores(String nombres[], String palabras[]) {
		for(int i = 0; i <CANTIDAD_DE_JUGADORES; i++) {
			jugadores[i] = new Jugador(i, nombres[i], palabras[i]);
			generarPalabraOculta(jugadores[i].getPalabra(), i);
		}
	}
	
	public int iniciarTurno() {
		int resultado;
		resultado = (int) (Math.random()*CIEN);
		if(resultado%DOS == CERO) {
			resultado = CERO;
		}else {
			resultado = UNO;
		}
		return resultado;
	}
	
	private void generarPalabraOculta(String palabra, int indice) {
		int tamañoPalabra = palabra.length();
		String palabraOculta="";
		for(int i = 0; i<tamañoPalabra;i++) {
			palabraOculta+="_ ";
		}
		jugadores[indice].setPalabraOculta(palabraOculta.trim().toLowerCase());
	}

	
	public Jugador[] getJugadores() {
		return jugadores;
	}
	
	public void buscarLetra(int indiceJugador, char letraABuscar) {
		String cadena = jugadores[indiceJugador].getPalabra();
		char cadenaChar[] = jugadores[indiceJugador].getCadenaocultaSinEspacio();
		String cadenaIncorrecta = jugadores[indiceJugador].getCadenaDeLetrasIncorrectas();
		byte busqueda = 0;
		
		for(int i = 0; i <cadena.length(); i++) {
			if(cadena.charAt(i) == letraABuscar) {
				busqueda++;
			}
		}
		
		for(int i = 0; i <cadena.length(); i++) {
			if(cadenaChar[i] == '_') {
				if(cadena.charAt(i) == letraABuscar) {
					cadenaChar[i] = letraABuscar;
				}else {
					cadenaChar[i] = '_';
					
				}
			}
		}
		
		String cadenaCompleta = "";
		
		for(int i = 0; i<cadenaChar.length; i++) {
			cadenaCompleta+=cadenaChar[i] + " ";
			
		}
		jugadores[indiceJugador].setPalabraOculta(cadenaCompleta);
		
		if(!(busqueda>0)) {
			int oponente = this.buscarIndiceJugador(indiceJugador);
			jugadores[oponente].restarOportunidades();
			cadenaIncorrecta+= letraABuscar + ", ";
			jugadores[indiceJugador].setCadenaDeLetrasIncorrectas(cadenaIncorrecta);
		}
	}
	
	private int buscarIndiceJugador(int indiceJugador) {
		int oponente;
		if(indiceJugador == CERO) {
			oponente = UNO;
		}else {
			oponente = CERO;
		}
		return oponente;
	}
	
	public boolean buscarPalabra(String palabraIngresada, int indice) {
		boolean resultado = false;
		String palabraCorrecta = jugadores[indice].getPalabra();
		if(palabraCorrecta.equals(palabraIngresada)) {
			resultado = true;
		}else {
			jugadores[indice].setOportunidades(CERO);
		}
		return resultado;
	}

	public String getCadena(int indiceJugador) {
		return "Palabra: " + jugadores[indiceJugador].getPalabraOculta();
	}
	
	public String getCadenaIncorrecta(int indiceJugador) {
		return jugadores[indiceJugador].getCadenaDeLetrasIncorrectas();
	}
	
	public String getNombreJugadorPedido(int indiceJugador) {
		return jugadores[indiceJugador].getNombreJugador();
	}
}
