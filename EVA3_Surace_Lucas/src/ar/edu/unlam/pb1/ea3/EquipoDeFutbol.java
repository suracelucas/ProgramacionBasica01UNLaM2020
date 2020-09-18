package ar.edu.unlam.pb1.ea3;

public class EquipoDeFutbol {
	private String nombre;
	private Jugador jugadores[];
	private final byte CANTIDAD_MAXIMA_DE_JUGADORES = 23;
	private byte jugadorActual = 0;
	
	public EquipoDeFutbol(String nombre) {
		jugadores = new Jugador[CANTIDAD_MAXIMA_DE_JUGADORES];
		this.nombre = nombre;
		this.vaciarVector();
	}
	public void vaciarVector() {
		for(int i = 0; i<jugadores.length; i++) {
			jugadores[i] = null;
		}
	}
	/*
	 * La capacidad máxima de un equipo es 23. No se permiten jugadores repetidosa
	 * Se retorna el resultado de la operación
	 */
	public boolean agregarJugador(Jugador jugador) {
		for(int i=0; i<jugadorActual;i++) {
			if(jugadores[i].getNombre().equalsIgnoreCase(jugador.getNombre())) {
				return false;
			}
		}
		
		if( jugadorActual < jugadores.length) {
			jugadores[jugadorActual] = jugador;
			this.jugadorActual++;
			return  true;
		}
		
		this.jugadorActual++;
		return false;
	}
	

	/*
	 * Permite cambiar cualquier jugador. 
	 * Para que el cambio se produzca, el jugador saliente debe estar presente en el equipo
	 */
	public boolean cambiarJugador(Jugador saliente, Jugador entrante) {
		saliente = buscar(saliente.getNombre());
		if(saliente == null) {
			return false;
		}
		for(int i=0; i<jugadores.length;i++) {
			if(jugadores[i].getNumero() == saliente.getNumero()) {
				jugadores[i] = entrante;
				return true;
			}
		}
		return false;
	}

	public Jugador[] getJugadores() {
		return jugadores;
	}
	
	/*
	 * Permite buscar un jugador por su numero. 
	 * 
	 */
	public Jugador buscar(int numero) {
		for(int i=0; i<jugadores.length;i++) {
			if(jugadores[i].getNumero() == numero) {
				return jugadores[i];
			}
		}
		return null;
	}
	
	/*
	 * Permite buscar un jugador por su nombre. 
	 * 
	 */
	public Jugador buscar(String nombre) {
		for(int i=0; i<jugadores.length;i++) {
			if(jugadores[i].getNombre().equalsIgnoreCase(nombre)) {
				return jugadores[i];
			}
		}
		return null;
	}
	
	/*
	 * Calcula el valor del equpo. 
	 * 
	 */
	public double calcularElValorDelEquipo() {
		double resultado = 0;
		for(int i = 0; i < jugadores.length; i++) {
			resultado += jugadores[i].getPrecio();
		}
		return resultado;
	}
	
	/*
	 * Calcula el precio promedio de sus jugadores 
	 * 
	 */
	public double calcularElPrecioPromedio() {
		double resultado = 0;
		resultado = this.calcularElValorDelEquipo();
		resultado /= jugadores.length;
		return resultado;
	}
	
	public String toString() {
		return this.nombre;
	}
	
}
