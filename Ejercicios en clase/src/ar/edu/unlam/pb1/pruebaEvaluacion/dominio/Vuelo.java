package ar.edu.unlam.pb1.pruebaEvaluacion.dominio;

public class Vuelo {

	private final int CANTIDAD_DE_FILAS = 32;
	private final int CANTIDAD_DE_ASIENTOS_POR_FILA = 6;
	private String origen;
	private String destino;
	private Pasajero[] pasajeros;
	private Pasajero[][] asientos;
	static int cantidadDePasajeros = 0;
	
	public Vuelo(String origen, String destino, int cantidadPasajero) {
		/*
		 * El constructor debe generar las acciones necesarias para
		garantizar el correcto funcionamiento de los objetos de la clase
		 */
		
		this.origen = origen;
		this.destino = destino;
		this.pasajeros = new Pasajero[cantidadPasajero];
		this.asientos = new Pasajero[CANTIDAD_DE_FILAS][CANTIDAD_DE_ASIENTOS_POR_FILA];
	}
	
	public boolean agregarPasajero(Pasajero pasajero) {
		/*
		 * Incorpora un nuevo pasajero a la lista de pasajeros del
		vuelo. Devuelve true si se pudo agregar o false si la capacidad del vuelo se
		encuentra completa.
		 */
		boolean resultado = false;
		for(int i = 0; i<this.pasajeros.length; i++) {
			if(pasajeros[i] == null) {
				pasajeros[i] = pasajero;
				resultado = true;
				cantidadDePasajeros++;
			}
		}
		return resultado;
	}
	
	public boolean verificarDisponibilidadAsiento(int fila, int columna) {
		/*
		 * Verifica si el asiento indicado se encuentra disponible.
		 */
		boolean resultado = false;
		if(this.asientos[fila][columna] == null) {
			resultado = true;
		}
		return resultado;
	}
	
	public Pasajero buscarPasajero(int dni) {
		/*
		 * Busca un pasajero en la lista de pasajeros a partir del DNI. Si no
		lo encuentra devuelve null.
		 */
		
		Pasajero pasajeroABuscar = null;
		
		for(int i = 0; i<cantidadDePasajeros; i++) {
			if(dni == pasajeros[i].getDni()) {
				pasajeroABuscar = pasajeros[i];
			}
		}
		return pasajeroABuscar;
	}
	
	public boolean asignarAsiento(Pasajero pasajero, int fila, int columna) {
		/*
		* Asigna el asiento al pasajero recibido por parámetro. Devuelve
		true si lo pudo asignar o false en caso que el asiento no se encuentre disponible.
		*/
		
		boolean resultado = false;
		if(verificarDisponibilidadAsiento(fila, columna)) {
			this.asientos[fila][columna] = pasajero;
			resultado = true;
		}
		return resultado;
	}
	
	public void ordenarListaDePasajerosPorDNI() {
		/*
		* Ordena la lista de pasajeros por DNI.
		*/
		
		for(int i = 1; i<=cantidadDePasajeros; i++) {
			for(int j = 0; j<cantidadDePasajeros; j++) {
				if(pasajeros[j+1]!=null) {
					if(pasajeros[j].getDni()>pasajeros[j+1].getDni()) {
						Pasajero aux = pasajeros[j];
						pasajeros[j] = pasajeros[j+1];
						pasajeros[j+1] = aux;
					}
				}
			}
		}
	}
	
	public Pasajero[] getPasajeros() {
		/*
		* Devuelve la lista de pasajeros
		*/
		return this.pasajeros;
	}
	
	public String toString() {
		/*
		* Devuelve un mapa de los asientos del vuelo indicando por cada uno
		si se encuentra libre "L" u ocupado "O".
		*/
		String cadena = "\n-------------";
		for(int i = 0; i<this.asientos.length;i++) {
			cadena+= "\n|";
			for(int j = 0; j<this.asientos[i].length;j++) {
				if(verificarDisponibilidadAsiento(i, j)) {
					cadena+= "L|";
				}else {
					cadena+= "O|";
				}
			}
			cadena += "\n-------------";
		}
		
		return cadena;
	}
		
}

