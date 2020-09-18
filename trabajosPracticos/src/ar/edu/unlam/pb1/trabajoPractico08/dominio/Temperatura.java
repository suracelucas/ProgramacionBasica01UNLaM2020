package ar.edu.unlam.pb1.trabajoPractico08.dominio;

public class Temperatura {
	  private final double UNIDAD_DE_CONVERSION_DESDE_FARENHEIT = 0.556;
		private final double UNIDAD_DE_CONVERSION_DESDE_KELVIN = 273.15;

	    private double valor;

	    public Temperatura(double valor) {
	        this.valor = valor;
	    }

	    public void setValor(double valor) {
	        this.valor = valor;
	    }

	    public void setValor(double valor, Temperaturas unidad) {
	        switch(unidad) {
				case CELSIUS:
					this.valor = valor;
					break;
				case FARENHEIT:
					this.valor = valor * UNIDAD_DE_CONVERSION_DESDE_FARENHEIT;
					break;
				case KELVIN:
					this.valor = valor - UNIDAD_DE_CONVERSION_DESDE_KELVIN;
			}
	    }

	    public double getValor() {
	        return this.valor;
	    }
}
