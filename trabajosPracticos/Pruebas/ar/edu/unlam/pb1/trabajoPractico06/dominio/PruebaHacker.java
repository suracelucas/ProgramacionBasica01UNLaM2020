package ar.edu.unlam.pb1.trabajoPractico06.dominio;

public class PruebaHacker {

	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta("Miguel", 1000);
		Hacker fede = new Hacker();
		
		double conseguido = fede.extraerDinero(cuenta1);
		
		System.out.println(cuenta1.toString());
		System.out.println("Dinero conseguido: "+ conseguido + "\n");
		System.out.println(cuenta1.toString());
		
		System.out.println(conseguido + cuenta1.getSaldo());
	}

}
