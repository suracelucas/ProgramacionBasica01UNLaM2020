package ar.edu.unlam.pb1.trabajoPractico06.dominio;

public class PruebaAscensor {

	public static void main(String[] args) {
		
		
		Ascensor ascensor1 = new Ascensor(1, 0, 10);
		System.out.println("Piso actual: " + ascensor1.getPisoActual());
		ascensor1.irAlPiso(5);
		System.out.println("Piso actual: " + ascensor1.getPisoActual());
		
		ascensor1.irAlPiso(2);
		System.out.println("Piso actual: " + ascensor1.getPisoActual());
		
	}
}
