package ar.edu.unlam.pb1.ejerciciosEnClase.dominio;

public class PruebaWhile {
	private byte numero = 2;
	
	public PruebaWhile() {
		
	}
	
	public int pocenciaDeDos(int potencia) {
		byte i = 0;
		while(i<= potencia) {
			numero *= 2;
			i++;
		}
		return numero;
	}
}
