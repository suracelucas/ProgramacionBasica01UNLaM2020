package ar.edu.unlam.pb1.trabajoPractico04.dominio;

public class PruebaDia {
	public static void main(String args[]) {
		Dia hoy = new Dia((byte) 3);
		
		System.out.println("El dia es " + hoy.getNombreDelDia());
	}
}
