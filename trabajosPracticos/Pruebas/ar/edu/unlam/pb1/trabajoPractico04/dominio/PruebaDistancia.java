package ar.edu.unlam.pb1.trabajoPractico04.dominio;

public class PruebaDistancia {
public final static double VALOR_A_CONVERTIR = 1000.0;
	public static void main(String[] args) {
		Distancia distancia1 = new Distancia(VALOR_A_CONVERTIR);
		
		System.out.println("El valor " + distancia1.getValor() + " mts equivale a " + distancia1.convertir(distancia1.DECAMETRO) + " dcs");
		distancia1.setValor(VALOR_A_CONVERTIR);
		System.out.println("El valor " + distancia1.getValor() + " mts equivale a " + distancia1.convertir(distancia1.HECTOMETRO) + " hcs");
		distancia1.setValor(VALOR_A_CONVERTIR);
		System.out.println("El valor " + distancia1.getValor() + " mts equivale a " + distancia1.convertir(distancia1.KILOMETRO) + " kms");
	}

}
