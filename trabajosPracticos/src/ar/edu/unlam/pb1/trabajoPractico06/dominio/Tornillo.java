package ar.edu.unlam.pb1.trabajoPractico06.dominio;

public class Tornillo {
	private final TipoDeCabeza TIPO_DE_CABEZA;
	private final int LONGITUD;
	private final int CANTIDAD_DE_ROSCA;
	private int posicionActual;
	
	private final byte CERO = (byte) 0;
	
	public Tornillo(TipoDeCabeza tipoDeCabeza, int longitud, int cantidadDeRoscas) {
		this.TIPO_DE_CABEZA = tipoDeCabeza;
		this.LONGITUD = longitud;
		this.CANTIDAD_DE_ROSCA = cantidadDeRoscas;
		this.posicionActual = cantidadDeRoscas;
	}
	
	public int getLongitud() {
		return this.LONGITUD;
	}
	
	public TipoDeCabeza getTipoDeCabeza() {
		return TIPO_DE_CABEZA;
	}
	
	public boolean girar(Sentido sentido) {
		boolean respuesta = false;
		
		if(sentido == Sentido.SENTIDO_HORARIO && this.posicionActual>CERO) {
			this.posicionActual--;
			respuesta = true;
		}
		
		if(sentido == Sentido.SENTIDO_ANTIHORARIO && this.posicionActual<this.CANTIDAD_DE_ROSCA) {
			this.posicionActual++;
			respuesta = true;
		}
		return respuesta;
	}
	
	public int getPosicionActual() {
		return this.posicionActual;
	}
}
