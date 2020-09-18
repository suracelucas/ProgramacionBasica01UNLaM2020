package ar.edu.unlam.pb1.trabajoPractico04.dominio;

public class Temperatura {
	public final byte CELSIUS = 0;
	public final byte FARENHEIT = 1;
	public final byte KELVIN = 2;
	private final double UNIDAD_DE_CONVERSION_DESDE_FARENHEIT = 0.556;
	private final double UNIDAD_DE_CONVERSION_DESDE_KELVIN = 273.15;
	
	private double valor;
	
	public Temperatura() {
		this.valor = 0.0;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public void setValor(double valor, byte unidad) {
		switch(unidad) {
			case CELSIUS:
				this.valor = valor;
			break;
			case FARENHEIT:
				this.valor = valor * UNIDAD_DE_CONVERSION_DESDE_FARENHEIT;
			break;
			case KELVIN:
				this.valor = valor - UNIDAD_DE_CONVERSION_DESDE_KELVIN;
			break;
		}
	}
}
