package ar.edu.unlam.pb1.trabajoPractico04.dominio;

public class Distancia {
	private final byte VALOR_DECAMETRO = 10;
	private final byte VALOR_HECTOMETRO = 100;
	private final int VALOR_KILOMETRO = 1000;
	
	public final byte DECAMETRO = 1;
	public final byte HECTOMETRO = 2;
	public final byte KILOMETRO = 3;
	
	private double valor; //En Metros.
	
	public Distancia(double valor) {
		this.setValor(valor);
	}

	public double getValor() {
		return this.valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double convertir(byte unidad) {
		switch(unidad) {
			case 1:
				this.valor = this.valor / this.VALOR_DECAMETRO;
			break;
			case 2:
				this.valor = this.valor / this.VALOR_HECTOMETRO;
			break;
			case 3:
				this.valor = this.valor / this.VALOR_KILOMETRO;
			break;
		}
		return this.valor;
	}
	
}
