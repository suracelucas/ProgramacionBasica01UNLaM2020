package ar.edu.unlam.pb1.trabajoPractico04.dominio;

public class PruebaLetra {

	public static void main(String[] args) {
		Letra letra1 = new Letra('w');
		
		if(letra1.esVocal()) {
			System.out.println("La letra " + letra1.getLetra() + " es vocal.\n");
		}else {
			System.out.println("La letra " + letra1.getLetra() + " es consonante.\n");
		}

	}

}
