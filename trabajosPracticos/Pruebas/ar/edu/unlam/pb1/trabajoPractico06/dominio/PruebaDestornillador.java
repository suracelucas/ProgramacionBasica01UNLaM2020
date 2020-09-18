package ar.edu.unlam.pb1.trabajoPractico06.dominio;

public class PruebaDestornillador {

	public static void main(String[] args) {
		Tarugo taguro1 = new Tarugo(10);
		Tornillo tornilloPlano = new Tornillo(TipoDeCabeza.PLANA, 10, 20);
		Tornillo tornilloAllen = new Tornillo(TipoDeCabeza.ALLEN, 20, 10);
		Destornillador destornilladorPlano = new Destornillador(TipoDeCabeza.PLANA);
		
		destornilladorPlano.atornillar(tornilloPlano, taguro1);
		System.out.println("Posicion actual del tornillo Plano: " + tornilloPlano.getPosicionActual());
		
		destornilladorPlano.atornillar(tornilloPlano);
		System.out.println("Posicion actual del tornillo Plano: " + tornilloPlano.getPosicionActual());
		
		destornilladorPlano.desatornillar(tornilloPlano);
		System.out.println("Posicion actual del tornillo Plano: " + tornilloPlano.getPosicionActual() + "\n\n");
		
		
		destornilladorPlano.atornillar(tornilloAllen, taguro1);
		System.out.println("Posicion actual del tornillo Allen: " + tornilloAllen.getPosicionActual());
		
		destornilladorPlano.atornillar(tornilloAllen);
		System.out.println("Posicion actual del tornillo Allen: " + tornilloAllen.getPosicionActual());
		
		destornilladorPlano.desatornillar(tornilloAllen);
		System.out.println("Posicion actual del tornillo Allen: " + tornilloAllen.getPosicionActual());

	}

}
