package ar.edu.unlam.pb1.trabajoPractico09.dominio;

public class Jugador {

	private String nombreJugador;
	private String palabra;
	private int numero;
	private String palabraOculta;
	private int oportunidades;
	private final byte CANTIDAD_DE_OPORTUNIDADES = 6;
	private char[] cadenaOcultaSinEspacio;
	private String cadenaDeLetrasIncorrectas;
	
	public Jugador(int numero, String nombre, String palabra) {
		this.setNombreJugador(nombre);
		this.setPalabra(palabra);
		this.setNumero(numero);
		this.oportunidades = CANTIDAD_DE_OPORTUNIDADES;
		this.cadenaOcultaSinEspacio = new char[palabra.length()];
		this.vaciarCadena();
		this.cadenaDeLetrasIncorrectas = "";
	}

	public int getOportunidades() {
		return this.oportunidades;
	}
	
	public String getCadenaDeLetrasIncorrectas() {
		return cadenaDeLetrasIncorrectas;
	}
	
	public void setOportunidades(int cantidad) {
		this.oportunidades = cantidad;
	}
	
	public void setCadenaDeLetrasIncorrectas(String cadena) {
		this.cadenaDeLetrasIncorrectas = cadena;
	}
	
	public char[] getCadenaocultaSinEspacio() {
		return cadenaOcultaSinEspacio;
	}
	
	public void restarOportunidades() {
		this.oportunidades--;
	}
	
	private void vaciarCadena() {
		for(int i = 0; i<cadenaOcultaSinEspacio.length; i++) {
			cadenaOcultaSinEspacio[i] = '_';
		}
	}
	
	public String getNombreJugador() {
		return this.nombreJugador;
	}

	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}

	public String getPalabra() {
		return this.palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public String getPalabraOculta() {
		return this.palabraOculta;
	}

	public void setPalabraOculta(String palabraOculta) {
		this.palabraOculta = palabraOculta;
	}
}
